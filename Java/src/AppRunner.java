public class AppRunner {
    public static void main(String[] args) {
        RunnableAndJumpable[] players = {
                new Cat("Мурзик"),
                new Human("John Connor"),
                new Robot("T-1000")
        };

        CheckCours[] cours = {
                new Threadmill(),
                new Wall()
        };

        for (CheckCours cour : cours) {
            cour.check(players[0]);
            cour.check(players[1]);
            cour.check(players[2]);
        }
    }
}
