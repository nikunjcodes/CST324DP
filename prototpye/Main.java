public class Main{
    public static void main(String[] args){
        GamePrototype game2 = new Chess("color1");
        Chess game1 = (AdvancedChess) game2.clone();
        game2.setColor("color2");
        game2.initializeGame();
        game2.startGame();
        game2.endGame();
        game1.displayGame();
        
    }
}