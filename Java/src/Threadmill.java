public class Threadmill implements CheckCours {
    @Override
    public void check(RunnableAndJumpable player) {
        System.out.println(player.toString() + " смог пробежать");
    }
}