package design_patterns.prototype;

class Point {
    public int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point [x=" + x + ", y=" + y + "]";
    }

}

class Line {
    public Point start;
    public Point end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public Line deepCopy() {
        Point newStart = new Point(start.x, start.y);
        Point newEnd = new Point(end.x, end.y);
        return new Line(newStart, newEnd);
    }

    @Override
    public String toString() {
        return "Line [start=" + start + ", end=" + end + "]";
    }

}

public class DeepCopyDemo {
    public static void main(String[] args) {
        Line line = new Line(new Point(1, 1), new Point(2, 2));
        Line line1 = line.deepCopy();
        line1.end.x = 3;
        line1.end.y = 30;
        System.out.println(line);
        System.out.println(line1);
    }
}
