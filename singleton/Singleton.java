public class Singleton{
    private static Singleton instance = null;
    private int age;
    private String name;
    private Singleton(){
        System.out.println("Singleton instance created");
    }
    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
    public void setSingleTonInstance(int a , String n ){
        this.age = a;
        this.name = n;
    }
    public String toString(){
        return "Name: " + name + " Age: " + age;
    }
    public void printMessage(Singleton s){
        System.out.println("Singleton instance: " + s);
    }
}