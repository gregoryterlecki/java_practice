public class HasFuel implements CarState {

  Car car;

  public HasFuel(Car newCar){
    car = newCar;
  }

  public void refillFuelTank(int fuelAmount){
    car.addFuel(fuelAmount);
    System.out.println(fuelAmount + " of fuel added. " + car.getTotalFuel() + "now remains.");
  }

  public void drive(int fuelSpent){
    System.out.println("Cannot drive yet, engine has not been started.");
  }

  public void startEngine(){
    System.out.println("Engine has been started (fuel is present).");
    car.setCarState(car.getEngineIsRunningState());
  }

  public void stopEngine(){
    System.out.println("Engine has been stopped.");
    car.setCarState(car.getEngineNotRunnningState());
  }


}
