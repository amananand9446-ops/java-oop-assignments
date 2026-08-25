public class Point {
    // write the code of point class here
    int x;
    int y;

    // Normal constructor set x and y from parameters
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Copy constructor create a new Point with the same values
    public Point(Point other) {
        this.x = other.x;
        this.y = other.y;
    }
}

