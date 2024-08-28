public class TicTacToe extends GamePrototype{
    public TicTacToe(){
        this.gameName = "Tic Tac Toe";

    }
    public void initializeGame(){
        System.out.println("Welcome to Tic Tac Toe!");
        System.out.println(" 1 | 2 | 3 ");
        System.out.println("-----------");
        System.out.println(" 4 | 5 | 6 ");
        System.out.println("-----------");
        System.out.println(" 7 | 8 | 9 ");
    }
    public void startGame(){
        System.out.println("Game has started!");
    }
    public void endGame(){
        System.out.println("Game has ended!");
    }

    public GamePrototype clone(){
        return this;
    }
}