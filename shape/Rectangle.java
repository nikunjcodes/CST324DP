import java.util.*;
public class Rectangle extends Shape{
    double width;
    double height;
    public Rectangle(){
        this.width = 1.0;
        this.height = 1.0;
    }
    public Rectangle(double width , double height){
        this.width = width;
        this.height = height;   
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public void draw(){
        System.out.println("Drawing a rectangle with width " + width + " and height " + height);
    }
    public double getArea(){
        return width * height;
    }
    public void setParams(){
        System.out.println("Enter the width of the rectangle: ");
        Scanner scanner = new Scanner(System.in);
        double width = scanner.nextDouble();
        this.setWidth(width);
        System.out.println("Enter the height of the rectangle: ");
        double height = scanner.nextDouble();
        this.setHeight(height);
    }

}