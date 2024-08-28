public class AdvancedChess extends Chess{
    Chess chess;
    public AdvancedChess(Chess chess){
        super(chess.color);
    }
    @Override
    public void startGame(){
        System.out.println("THE GAME HAS STARTED");
        if(this.color == "color2"){
            System.out.println("       WHITE          ");
            System.out.println();
            System.out.println("R  H B  Q  K  B  H  R");
            System.out.println("P  P P  P  P  P  P  P");
            for(int i=0 ; i<6 ; i++)
            System.out.println("_  _  _  _  _  _  _  _");
            System.out.println("p  p  p  p  p  p  p  p");
            System.out.println("r  h  b  q  k  b  h  r");
            System.out.println();
            System.out.println("        BLACK         ");
            System.out.println();
        }
        else{
            System.out.println("       BLACK          ");
            System.out.println();
            System.out.println("r  h b  q  k  b  h  r");
            System.out.println("p  p p  p  p  p  p  p");
            for(int i=0 ; i<6 ; i++)
            System.out.println("_  _  _  _  _  _  _  _");
            System.out.println("P  P  P  P  P  P  P  P");
            System.out.println("R  H  B  Q  K  B  H  R");
            System.out.println();
            System.out.println("        WHITE         ");
            System.out.println();
        }
    }
}