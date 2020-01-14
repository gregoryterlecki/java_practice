public class ThreadedCode implements Runnable {

  public void run() {

    BankSingleton bank = BankSingleton.getInstance();

    System.out.println("Bank object ID: " + System.identityHashCode(bank));

    double randomAmount = bank.withDrawRandomCash();

    System.out.println("Random amount withdrawn: " + randomAmount);
    System.out.println("Cash remaining: " + bank.cashRemaining());

  }
}
