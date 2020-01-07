public class Drive implements CarState {

  Car car;

  public Drive(Car newCar){
    car = newCar;
  }

  void refillFuelTank(int fuelAmount){
    System.out.println("Cannot refuel car while it is driving!");
  }

  void drive(int fuelSpent){
    
  }

  void startEngine(){

  }

  void stopEngine(){

  }



}
