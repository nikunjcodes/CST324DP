import java.util.*;

public class Square extends Shape{
    double side;
    public Square(){
        this.side = 1.0;
    }
    public Square(double side){
        this.side = side;
    }
    public double getSide(){
        return side;
    }
    public void setSide(double side){
        this.side = side;
    }
    public void draw(){
        System.out.println("Drawing a square with side " + side);
    }
    public double getArea(){
        return side * side;
    }
    public void setParams(){
        System.out.println("Enter the side of the square: ");
        Scanner scanner = new Scanner(System.in);
        double side = scanner.nextDouble();
        this.setSide(side);
    }
}   