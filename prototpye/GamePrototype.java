public class GamePrototype{
    protected String gameName;
    protected String color;
    public void initializeGame(){
        System.out.println("Welcome to the game!");
    }
    public void displayGame(){
        System.out.println("Games has been displayed");
    }
    public void startGame(){
        System.out.println("Game has started!");
    }
    public void endGame(){
        System.out.println("Game has ended!");
    }
    public GamePrototype clone(){
        return new GamePrototype();
    }
    public String getGameName(){
        return gameName;
    }
    public String getColor(){
        return color;
    }
    public void setGameName(String gameName){
        this.gameName = gameName;
    }
    public void setColor(String color){
        this.color =  color;
    }
}