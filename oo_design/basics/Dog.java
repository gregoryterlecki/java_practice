public class Dog extends Animal {

  public void digHole(){
    System.out.println("Dug a hole");
  }

  public Dog(String newName){
    // super();
    setName(newName);
  }

}
