public class Car {

  CarState hasFuel;
  CarState hasNoFuel;
  CarState engineIsRunning;
  CarState engineNotRunning;

  CarState carState;

  int fuelRemaining = 0;
  boolean carRunning = false;

  public Car() {
    hasFuel = new HasFuel(this);
    hasNoFuel = new HasNoFuel(this);
    engineIsRunning = new EngineIsRunning(this);
    engineNotRunning = new EngineNotRunning(this);

    carState = hasNoFuel;
  }

  void setCarState(CarState newState){
    carState = newState;
  }

  public int addFuel(int fuelToAdd){
    this.fuelRemaining += fuelToAdd;
  }

  public int getTotalFuel(){
    return fuelRemaining;
  }

  public void refillFuelTank(int fuelAmount){

  }

  public void deductFuel(int fuelAmount){
    fuelRemaining -= fuelAmount;
  }

  public void drive(int fuelSpent){
    carState.drive(fuelSpent);
  }

  public void startEngine(){

  }

  public void stopEngine(){

  }

  public CarState getHasFuelState() { return hasFeul; }
  public CarState getHasNoFuelState() { return hasNoFuel; }
  public CarState getEngineIsRunningState() { return engineIsRunning; }
  public CarState getEngineNotRunnningState() { return engineNotRunning; }
}
