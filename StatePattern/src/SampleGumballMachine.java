public class SampleGumballMachine {
  public static void main(String[] args) {
    System.out.println("Welcome to our gumball machine!");
    GumBallMachine gumBallMachine = new GumBallMachine(1);
    gumBallMachine.insertQuater();
    gumBallMachine.turnCrank();
    gumBallMachine.dispense();

    gumBallMachine.insertQuater();
}
}