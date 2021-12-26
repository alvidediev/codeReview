public class Cat implements RunnableAndJumpable{
    private String name;

    @Override
    public String toString() {
        return name;
    }

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void jump() {

    }

    @Override
    public void run() {

    }
}