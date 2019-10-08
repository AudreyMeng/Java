public class NoQuarterState implements State {
  GumBallMachine gumBallMachine;

  public NoQuarterState(GumBallMachine gumBallMachine) {
    this.gumBallMachine = gumBallMachine;
  }

  @Override
  public void insertQuater() {
    System.out.println("Get your quarter, please wait for your gumball");
    gumBallMachine.setState(gumBallMachine.getHasQuarterState());
  }

  @Override
  public void ejectQuarter() {
    System.out.println("Not qualified quarter");
  }

  @Override
  public void turnCrank() {
    System.out.println("Please insert quarter first before turn crank");
  }

  @Override
  public void dispense() {
    System.out.println("No gumball to dispense");
  }
}