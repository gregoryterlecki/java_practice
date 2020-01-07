/* Corresponding states:
  HasFuel,
  HasNoFuel,
  EngineIsRunning,
  CarWarrentyVoided AND EngineIsRunning,
  EngineNotRunning
*/

public interface CarState {

  void refillFuelTank(int fuelAmount);

  void drive(int fuelSpent);

  void startEngine();

  void stopEngine();

}
