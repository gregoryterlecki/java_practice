/*
  SINGLETON

  What is it?
  A singleton is a class that is designed to only have one instance, providing
  global access to it.

  In this class, the single instance is a private static attribute, and has a
  corresponding public static accessor function for that class.
  In the accessor function of this class, we do 'lazy instantiaion' which means
  creation of the object is done at first use.
  All constructors are protected or private.
  Only the accessor function can be used to manipulate the singleton.

  Since a singleton is supposed to be global, we want to prevent race
  conditions from occuring where two threads try to access the get instance
  method while another thread is already in there.

*/

public class Main {

  // Try to show:
  // 1. Two threads competing for object creation
  // 2. Slow synchronization to fix it
  // 3. Fast synchronization version

  // hint: remember about System.identityHashCode(Object obj);

  public static void main(String[] args){

    BankSingleton bank1 = BankSingleton.getInstance();
    System.out.println("Bank 1 ID: " + System.identityHashCode(bank1));

    BankSingleton bank2 = BankSingleton.getInstance();
    System.out.println("Bank 2 ID: " + System.identityHashCode(bank2));

    double amt1 = bank1.withDrawRandomCash();
    System.out.println("Random amount: " + amt1);

    double amt2 = bank1.withDrawRandomCash();
    System.out.println("Random amount: " + amt2);

    System.out.println("Bank 1 cash remaining: " + bank1.cashRemaining());
    System.out.println("Bank 2 cash remaining: " + bank2.cashRemaining());

    // even though we didnt deduct any cash from the bank2 object, the amounts
    // remaining for both bank objects are the same. That is because of the singleton
    // pattern. Both bank1 and bank2 are referring to the same intances in memory,
    // so its properties stay the same

  }

}
