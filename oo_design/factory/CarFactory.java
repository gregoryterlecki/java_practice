public class CarFactory {

  public Car makeCar(String carType){
    switch(carType){
      case "E": return new ElectricCar();
      case "G": return new GasCar();
      default: return null;
    }
  }

}
