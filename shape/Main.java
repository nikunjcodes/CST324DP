import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShapeFactory shapeFactory = new ShapeFactory();
        while (true) {
            System.out.print("Enter the shape you want to draw: ");
            String shapeType = scanner.nextLine();

            Shape shape = shapeFactory.getShape(shapeType);

            if (shape != null) {
                shape.setParams();
                shape.draw();
                System.out.println("Area of the " + shapeType + " is " + shape.getArea());
            } else {
                System.out.println("Invalid shape type");
            }
        }
    }
}
