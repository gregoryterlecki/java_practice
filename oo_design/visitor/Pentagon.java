public class Pentagon implements Visitable{

  private int numberOfSides;

  public Pentagon(){
    numberOfSides = 5;
  }

  public int getNumberOfSides(){
    return numberOfSides;
  }

  public int accept(ShapeVisitor visitor){
    visitor.visit(this);
  }

}
