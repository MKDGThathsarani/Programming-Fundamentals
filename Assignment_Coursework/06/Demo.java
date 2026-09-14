public class Demo {

    // Circle perimeter (circumference)
    public static double perimeter(double radius) {
        return 2 * Math.PI * radius;
    }

    // Rectangle perimeter
    public static double perimeter(double length, double width) {
        return 2 * (length + width);
    }

    // Square perimeter
    public static double perimeter(int side) {
        return 4 * side;
    }

    // Triangle perimeter
    public static double perimeter(double side1, double side2, double side3) {
        return side1 + side2 + side3;
    }

    // Main method for testing
    public static void main(String[] args) {
        // Circle
        System.out.printf("Circle perimeter (radius 5): %.2f\n", perimeter(5.0));

        // Rectangle
        System.out.printf("Rectangle perimeter (length 4, width 6): %.2f\n", perimeter(4.0, 6.0));

        // Square
        System.out.println("Square perimeter (side 7): " + perimeter(7));

        // Triangle
        System.out.printf("Triangle perimeter (sides 3, 4, 5): %.2f\n", perimeter(3.0, 4.0, 5.0));
    }
}
