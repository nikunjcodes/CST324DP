public class DeadState implements PlayerState {

    public void action(Player p ){
        System.out.println("Player Dead xd");

        p.die();
    }
}
