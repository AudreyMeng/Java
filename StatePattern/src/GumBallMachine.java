public class GumBallMachine {
  private State soldOutState;
  private State noQuarterState;
  private State hasQuarterState;
  private State soldState;

  private State state = soldOutState;
  private int count = 0;

  public GumBallMachine(int numberGumBalls) {
      soldOutState = new SoldOutState(this);
      noQuarterState = new NoQuarterState(this);
      hasQuarterState = new HasQuarterState(this);
      soldState = new SoldState();

      this.count = numberGumBalls;
      if (this.count > 0) {
        this.state = noQuarterState;
      }
  }

  public void insertQuater() {
    state.insertQuater();
  }

  public void ejectQuarter() {
    state.ejectQuarter();
  }

  public void turnCrank() {
    state.turnCrank();
  }

  public void dispense() {
    state.dispense();
  }

  public void setState(State state) {
    this.state = state;
  }

  public void releaseBall() {
    System.out.println("Your gumball is served, enjoy!");
    if (this.count > 0) {
      this.count--;
    }
  }

  public int countGumBall() {
    return this.count;
  }

  public State getNoQuarterState() {
    return this.noQuarterState;
  }

  public State getSoldOutState() {
    return this.soldOutState;
  }

  public State getHasQuarterState() {
    return this.hasQuarterState;
  }

  public State getSoldState() {
    return this.soldState;
  }
}
