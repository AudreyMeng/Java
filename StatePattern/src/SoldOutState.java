public class SoldOutState implements State {

  public SoldOutState() {}

  @Override
  public void insertQuater() {
    System.out.println("Sorry, sold out! No more coins");
  }

  @Override
  public void ejectQuarter() {
    System.out.println("Sorry, sold out! No eject");
  }

  @Override
  public void turnCrank() {
    System.out.println("Sorry, sold out! turn crank won't work");
  }

  @Override
  public void dispense() {
    System.out.println("Sorry, sold out! No gumball to dispense");
  }
}