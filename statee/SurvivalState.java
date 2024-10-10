public class SurvivalState implements PlayerState {
    public void action(Player p ){
        System.out.println("Player in Survival State");
        p.survive();
        p.hide();

    }
    
}
