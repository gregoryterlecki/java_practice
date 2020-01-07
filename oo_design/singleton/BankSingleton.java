public class BankSingleton {

  private static BankSingleton instance = null;// static becuase the instance is global

  private double totalCash = 1000000;

  private BankSingleton(){ }

  public static BankSingleton getInstance(){
    if(instance == null){
      instance = new Singleton();         // lazy instantiaion
    }
    return instance;
  }

}
