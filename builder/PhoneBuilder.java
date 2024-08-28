public class PhoneBuilder{
    Phone p = new Phone();
    public PhoneBuilder setOs(String os){
        p.os = os;
        return this;
    }
    public PhoneBuilder setRam(int ram){
        p.ram = ram;
        return this;
    }
    public PhoneBuilder setScreenSize(int screenSize){
        p.screenSize = screenSize;
        return this;
    }
    public Phone getGadget(){
        return p;
    }
}