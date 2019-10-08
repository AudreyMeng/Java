public class HasQuarterState implements State {
  GumBallMachine gumBallMachine;

  public HasQuarterState(GumBallMachine gumBallMachine) {
    this.gumBallMachine = gumBallMachine;
  }

  @Override
  public void insertQuater() {
    System.out.println("We've already got your quarter, no more quarter needed");
  }

  @Override
  public void ejectQuarter() {
    System.out.println("Sorry, we need to eject your quarter");
    gumBallMachine.setState(gumBallMachine.getNoQuarterState());
  }

  @Override
  public void turnCrank() {
    System.out.println("Turn Crank To Get Your Gumball Treat");
    gumBallMachine.setState(gumBallMachine.getSoldState());
  }

  @Override
  public void dispense() {
    System.out.println("No gumball dispensed");
  }
}