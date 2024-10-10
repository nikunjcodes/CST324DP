public class HealthyState implements PlayerState {
    public void action(Player p ){
        System.out.println("Player in Healthy State 💪");

        p.attack();
        p.heal();
        p.fireBomb();
        p.fireGun();
    }
    
}
