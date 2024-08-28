import java.util.Scanner;

public class Circle extends Shape{
    double radius;
    public Circle(){
        this.radius = 1.0;
    }
    public Circle(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }

    public void draw(){
        System.out.println("Drawing a circle with radius " + radius);
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }
    public void setParams(){
        System.out.println("Enter the radius of the circle: ");
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();
        this.setRadius(radius);
    }

}