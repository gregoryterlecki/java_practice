public interface ShapeVisitorInterface {

  public boolean isTessellatable(Triangle triangle);
  public boolean isTessellatable(Square square);
  public boolean isTessellatable(Pentagon pentagon);
  public boolean isTessellatable(Hexagon hexagon);  

}
