public class GameContext {
     PlayerState state   = null;
     Player player =  new Player();
    public void setState(PlayerState state){
        this.state = state;
    }
    public void gameAction(){
        state.action(player);
    }

    
}
