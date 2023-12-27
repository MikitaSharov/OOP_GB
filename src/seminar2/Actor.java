package seminar2;

public abstract class Actor implements ActorBehavior {
    protected String name;
    protected boolean isMakeOrder = false;
    protected boolean isTakeOrder = false;

    public Actor(String name) {
        this.name = name;
    }

    abstract String getName();
}
