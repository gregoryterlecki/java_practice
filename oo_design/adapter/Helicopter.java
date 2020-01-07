import java.util.Random;

public class Helicopter implements HelicopterInterface {

  Random generator = new Random();

  public void hover(){
    int height = generator.nextInt(50) + 1;
    System.out.println("Helicoter has started flying at " + height +
      " meters off the ground");
  }

  public void verticalLand(){
    System.out.println("Helicopter has landed vertically");
  }

}
