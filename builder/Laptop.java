public class Laptop{
    String os;
    int ram;
    int screensize;
    public Laptop(){}
    public Laptop(String os, int ram, int screensize){
        this.os = os;
        this.ram = ram;
        this.screensize = screensize;
    }
    public String toString(){
        return "OS: " + os + " RAM: " + ram + " Screen Size: " + screensize;
    }
}