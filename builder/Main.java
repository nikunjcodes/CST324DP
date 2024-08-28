public class Main{
    public static void main(String[] args){
        // Phone p  = new Phone();
        // System.out.println(p);
        // PhoneBuilder builder = new PhoneBuilder();
        // p = builder.setOs("Android").setRam(2).setScreenSize(5).getGadget();
        // System.out.println(p);
        Laptop l = new Laptop();
        System.out.println(l);
        LaptopBuilder builder = new LaptopBuilder();
        l = builder.setOS("Windows").setRam(8).setScreenSize(18).getGadget();
        System.out.println(l);
    }
}