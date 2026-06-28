//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(10, 20);
        Point p2 = new Point(30, 40);

        Rectangle r1 = new Rectangle(p1, p2);
        Rectangle r2 = new Rectangle(r1);
        Rectangle r3 = new Rectangle(0, 0, 100, 100);
        System.out.println("Object crated successfully");

    }
}