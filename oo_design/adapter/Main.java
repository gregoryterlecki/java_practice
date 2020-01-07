/*
  ADAPTER

  What is it?
  It's an oo design pattern that allows 2 incompatible interfaces to work
  together (the available interface and the target interface).
  It's used when the client expects a (target) interface.

  Any class can work together as long as the Adapter solves the issue that all
  classes must implement every method defined by the shared interface.

  When is it useful?
  TODO fill this is
*/

public class Main {

  public static void main(String[] args){
    Helicopter apacheHelecopter = new Helicopter();
    Jet f18 = new Jet();
    HelicopterInterface jetAdapter = new JetAdapter(f18);

    System.out.println("Helicopter");
    apacheHelecopter.hover();
    apacheHelecopter.verticalLand();

    System.out.println("Jet");
    f18.takeOff();
    f18.landOnRunway();

    System.out.println("Helicopter adapter");
    jetAdapter.hover();
    jetAdapter.verticalLand();

  }

}
