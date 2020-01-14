import java.util.Random;

public class BankSingleton {

  private static BankSingleton instance = null;// static becuase the instance is global

  private double totalCash = 1000000.00;

  private static boolean firstThread = true;

  // constructor is private because the only way to instantiate the instance will
  // be through the public method getInstance()
  private BankSingleton(){ }

  public static BankSingleton getInstance(){

    if(instance == null){
      if(firstThread){
        firstThread = false;
        Thread.currentThread();
        try{
          Thread.sleep(1000);
        }
        catch(InterruptedException e){
          e.printStackTrace();
        }
      }

      // // lazy instantiaion - means that if the object isnt needed, it wont be created
      // instance = new BankSingleton();

      // fixes the thread problem. Only one thread at a time will be able to reach this block of code.
      // Commenting out this code and uncommenting out the code on line 30 should
      // result in two distinct identityHashCodes, and incorrect amounts of cash
      // remaining.
      synchronized(BankSingleton.class){
        if(instance == null){
          instance = new BankSingleton();
        }
      }
    }
    return instance;
  }

  public double withDrawRandomCash(){
    Random random = new Random();
    double randomAmount = Math.round( (100 + random.nextDouble() * 10000) * 100.0 ) / 100.0;
    totalCash -= randomAmount;
    return randomAmount;
  }

  public double cashRemaining(){
    return totalCash;
  }

}
