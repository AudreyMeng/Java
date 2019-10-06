public class CuteDuckExample {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.performFly();
        mallardDuck.performQuack();

        mallardDuck.setQuackBehavior(new Squeak());
        mallardDuck.performQuack();
    }
}
