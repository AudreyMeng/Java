public abstract class Duck {
    /**
     * instance variables declare as INTERFACE,
     * hold a reference to specific behavior at RUNTIME.
     */
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {
    }

    /** behaviors all duck types share */
    public void swim() {
        System.out.println("All ducks float");
    }

    /** behaviors each duck type varies */
    public abstract void display();

    /** behaviors duck types vary or share */
    public void performFly() {
        flyBehavior.fly();
    }
    public void performQuack() {
        quackBehavior.quack();
    }

    /** Setting Behavior Dynamically */
    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }
    public void setQuackBehavior(QuackBehavior qb){
        quackBehavior = qb;
    }
}
