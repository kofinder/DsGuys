package design_patterns.adaptor;

class Square {
    public int side;

    public Square(int side) {
        this.side = side;
    }
}

interface Rectangle {
    int getWidth();

    int getHeight();

    default int getArea() {
        return getWidth() * getHeight();
    }
}

// You are given a Rectangle interface and an extension method on it.
// Try to define a SquareToRectangleAdapter that adapts the Square
// to the IRectangle interface.
class SquareToRectangleAdapter implements Rectangle {
    private Square square;

    public SquareToRectangleAdapter(Square square) {
        this.square = square;
    }

    @Override
    public int getWidth() {
        return this.square.side;
    }

    @Override
    public int getHeight() {
        return this.square.side;
    }

}

public class DimesionAdoptionDemo {
    public static void main(String[] args) {
        Square sq = new Square(11);
        SquareToRectangleAdapter adapter = new SquareToRectangleAdapter(sq);
        System.err.println("Area ============>:" + adapter.getArea());

    }
}
