public class Chess extends GamePrototype{
    public Chess(String color){
        this.gameName= "Chess";
        this.color= color;
    }
  
    @Override
    public void initializeGame(){
        System.out.println("Welcome to Chess!");
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
    @Override
    public void startGame(){
        System.out.println("Game has started!");
        if(this.color == "color1")
            System.out.println("You are White");
        else
            System.out.println("You are black");
    }
    @Override
    public void endGame(){
        System.out.println("Game has ended!");
    }
    @Override
    public GamePrototype clone(){
        return this;
    }
}