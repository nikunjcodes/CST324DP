abstract class Shape{
    public void draw(){
        System.out.println("Drawing a shape");
    }
    abstract double getArea();
    abstract void setParams();
}