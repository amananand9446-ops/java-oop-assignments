public class Rectangle {

    // write the code of Rectangle class here
    Point topLeft;
    Point bottomRight;

    // Constructor 1 build from four raw integers
    public Rectangle(int topLeftX, int topLeftY, int bottomRightX, int bottomRightY) {
        this.topLeft     = new Point(topLeftX, topLeftY);
        this.bottomRight = new Point(bottomRightX, bottomRightY);
    }

    // Constructor 2 build from two Points  deep copy each one
    public Rectangle(Point topLeft, Point bottomRight) {
        this.topLeft     = new Point(topLeft);
        this.bottomRight = new Point(bottomRight);
    }

    // Constructor 3 copy constructor  deep copy another Rectangle
    public Rectangle(Rectangle other) {
        this.topLeft     = new Point(other.topLeft);
        this.bottomRight = new Point(other.bottomRight);
    }
}

