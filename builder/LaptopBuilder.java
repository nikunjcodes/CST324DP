public class LaptopBuilder{
    Laptop laptop = new Laptop();
    public LaptopBuilder setOS(String os){
        laptop.os = os;
        return this;
    }
    public LaptopBuilder setRam(int ram){
        laptop.ram = ram;
        return this;
    }
    public LaptopBuilder setScreenSize(int screensize){
        laptop.screensize = screensize;
        return this;
    }
    public Laptop getGadget(){
        return laptop;
    }
}