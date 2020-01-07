public abstract class Car {

  private String name;
  private double torque;
  private double power;

  public String getName(){ return name; }
  public void setName(String newName){ name = newName; }

  public double getTorque(){ return torque; }
  public void setTorque(double newTorque){ torque = newTorque; }

  public double getPower(){ return power; }
  public void setPower(double newPower){ power = newPower; }

  public void drive(){
    System.out.println(getName() + " is driving with " + getTorque() + "Nm torque and " + getPower() + "kW of power.");
  }
  public void stop(){
    System.out.println(getName() + " has stopped.");
  }

}
