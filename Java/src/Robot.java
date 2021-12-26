public class Robot implements RunnableAndJumpable{
    private String name;

    public Robot(String name) {
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
        return name;
    }
}
