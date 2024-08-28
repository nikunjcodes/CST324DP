import java.util.Scanner;
public class AbstractFactoryPenDemo{
    public static void main(String[] args){
        PenFactory pf =  new PenFactory();
        Pen p;
        System.out.println("Enter the pen type: ");
        Scanner sc = new Scanner(System.in);
        String penType = sc.nextLine();
        p = pf.getPen(penType);
        System.out.println(p.getPenType());
        p.write();
    }
}