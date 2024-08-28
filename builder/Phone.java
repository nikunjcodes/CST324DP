public class Phone{
    String os;
    int ram;
    int screenSize;
    public Phone(){
    }
    public Phone(String os, int ram, int screenSize){
        this.os = os;
        this.ram = ram;
        this.screenSize = screenSize;
    }
    public String toString(){
        return "OS: " + os + " RAM: " + ram + " Screen Size: " + screenSize;
    }

}