public class Main{
    public static void main(String[] args){
        System.out.println("Singleton Demonstration");
        Singleton s1  = Singleton.getInstance();
        s1.setSingleTonInstance(20, "John");
        System.out.println("Singleton instance: " + s1);
        Singleton s2 = Singleton.getInstance();
        s2.setSingleTonInstance(30, "Doe");
        System.out.println("Singleton instance: " + s2);
    }
}