public class Human implements RunnableAndJumpable{

    private String name;

    public Human(String name) {
        this.name = name;
    }

    @Override
    public void jump() {

    }

    @Override
    public void run() {

    }

    @Override
    public String toString() {
        return  name;
    }
}