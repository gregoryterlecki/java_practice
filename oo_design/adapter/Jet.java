import java.util.Random;

public class Jet {

  Random generator = new Random();

  public void takeOff(){
    int speed = generator.nextInt(10) + 1;
    System.out.println("Jet is flying with speed " + speed);
  }

  public void landOnRunway(){
    int yards = generator.nextInt(999) + 1;
    System.out.println("Jet landed in " + yards + " yards on the runway");
  }

}
