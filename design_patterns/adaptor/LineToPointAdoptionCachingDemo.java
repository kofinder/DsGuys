package design_patterns.adaptor;

import java.util.*;
import java.util.function.Consumer;

class NPoint {
    public int x, y;

    public NPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        NPoint point = (NPoint) o;

        if (x != point.x)
            return false;
        return y == point.y;
    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        return result;
    }

    @Override
    public String toString() {
        return "Point{" +
                "first=" + x +
                ", second=" + y +
                '}';
    }
}

class Line {
    public NPoint start, end;

    public Line(NPoint start, NPoint end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Line line = (Line) o;

        if (!start.equals(line.start))
            return false;
        return end.equals(line.end);
    }

    @Override
    public int hashCode() {
        int result = start.hashCode();
        result = 31 * result + end.hashCode();
        return result;
    }
}

class VectorObject extends ArrayList<Line> {
}

class VectorRectangle extends VectorObject {
    public VectorRectangle(int x, int y, int width, int height) {
        add(new Line(new NPoint(x, y), new NPoint(x + width, y)));
        add(new Line(new NPoint(x + width, y), new NPoint(x + width, y + height)));
        add(new Line(new NPoint(x, y), new NPoint(x, y + height)));
        add(new Line(new NPoint(x, y + height), new NPoint(x + width, y + height)));
    }
}

class LineToPointAdapter implements Iterable<NPoint> {
    private static int count = 0;
    private static Map<Integer, List<NPoint>> cache = new HashMap<>();
    private int hash;

    public LineToPointAdapter(Line line) {
        hash = line.hashCode();
        if (cache.get(hash) != null)
            return; // we already have it

        System.out.println(
                String.format("%d: Generating points for line [%d,%d]-[%d,%d] (no caching)",
                        ++count, line.start.x, line.start.y, line.end.x, line.end.y));

        ArrayList<NPoint> points = new ArrayList<>();

        int left = Math.min(line.start.x, line.end.x);
        int right = Math.max(line.start.x, line.end.x);
        int top = Math.min(line.start.y, line.end.y);
        int bottom = Math.max(line.start.y, line.end.y);
        int dx = right - left;
        int dy = line.end.y - line.start.y;

        if (dx == 0) {
            for (int y = top; y <= bottom; ++y) {
                points.add(new NPoint(left, y));
            }
        } else if (dy == 0) {
            for (int x = left; x <= right; ++x) {
                points.add(new NPoint(x, top));
            }
        }

        cache.put(hash, points);
    }

    @Override
    public Iterator<NPoint> iterator() {
        return cache.get(hash).iterator();
    }

    @Override
    public void forEach(Consumer<? super NPoint> action) {
        cache.get(hash).forEach(action);
    }

    @Override
    public Spliterator<NPoint> spliterator() {
        return cache.get(hash).spliterator();
    }
}

class LineToPointAdoptionCachingDemo {
    private static final List<VectorObject> vectorObjects = new ArrayList<>(Arrays.asList(
            new VectorRectangle(1, 1, 10, 10),
            new VectorRectangle(3, 3, 6, 6)));

    public static void drawPoint(NPoint p) {
        System.out.print(".");
    }

    private static void draw() {
        for (VectorObject vo : vectorObjects) {
            for (Line line : vo) {
                LineToPointAdapter adapter = new LineToPointAdapter(line);
                adapter.forEach(point -> drawPoint(point));
            }
        }
    }

    public static void main(String[] args) {
        draw();
        draw();
    }
}
