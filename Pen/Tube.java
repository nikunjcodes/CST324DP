import java.util.*;
abstract class Tube {
    abstract String getTube();
}
class Metal extends Tube{
    public String getTube(){
        return "Metab Tube created";
    }

}
class Fibre extends Tube{
    public String getTube(){
        return "Fibre Tube created";
    }
}
class Test{
public static void main(String[] args){
    TubeFactory tf = new TubeFactory();
    Tube t;
    System.out.println("Enter the tube type: ");
    Scanner sc = new Scanner(System.in);
    String tubeType = sc.nextLine();
    t = tf.getTube(tubeType);
    System.out.println(t.getTube());
}
}