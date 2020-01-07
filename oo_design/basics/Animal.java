public class Animal {

  private String name;
  private double height;
  private int weight;
  private String sound;

  public static int population = 0;

  public Animal() {
    population++;
  }

  public void setName(String newName) { name = newName; }
  public String getName(){ return name;}
  public void setHeight(double newHeight){ height = newHeight; }
  public double getHeight(){ return height; }
  public void setWeight(int newWeight){ weight = newWeight; }
  public int getWeight(){ return weight; }
  public void setSound(String newSound){ sound = newSound; }
  public String getSound(){ return sound; }

}
