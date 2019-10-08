public class SoldState implements State {
  GumBallMachine gumBallMachine;

  public SoldState(GumBallMachine gumBallMachine) {
    this.gumBallMachine = gumBallMachine;
  }

  @Override
  public void insertQuater() {
    System.out.println("Please wait, gumball is on the way");
  }

  @Override
  public void ejectQuarter() {
    System.out.println("You have already turned the crank");
  }

  @Override
  public void turnCrank() {
    System.out.println("Sorry, turning the crank twice is not a good idea");
  }

  @Override
  public void dispense() {
    gumBallMachine.releaseBall();
    
    if (gumBallMachine.countGumBall() > 0) {
      System.out.println("Reset to NoQuarterState");
      gumBallMachine.setState(gumBallMachine.getNoQuarterState());
    } else {
      System.out.println("Reset to SoldOutState");
      gumBallMachine.setState(gumBallMachine.getSoldOutState());
    }
  }
}