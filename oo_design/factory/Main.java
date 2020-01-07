/*
  FACTORY

  What is it?
  A factory is an oo design pattern where, in a case where you need one of
  several possible classes to be used (which share a common superclass), you
  delegate this job to a class of it's own. This class would be called a
  factory.
  So, a factory is a class that returns one of several classes that have a
  common superclass.

  When would you use it?
  When you don't know ahead of time what class is needed for a particular case.
  WHen all potential classes are part of the same superclass.
  To centralize class selection code.
  When the user shouldn't have to know about every possible subclass.
  To encapsulate object creation.

*/

import java.util.Scanner;

public class Main {

  public static void main(String args[]){

    CarFactory carFactory = new CarFactory();
    Car car = null;
    Scanner userInput = new Scanner(System.in);
    System.out.println("What type of car? (E / G)");
    if(userInput.hasNextLine()){
      String carType = userInput.nextLine();
      car = carFactory.makeCar(carType);
    }
    if(car != null){
      doCarStuff(car);
    } else {
      System.out.println("Enter correct options");
    }

  }

  public static void doCarStuff(Car car){
    car.drive();
    car.stop();
  }

}
