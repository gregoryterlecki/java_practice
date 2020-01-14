public class MainTestThreads {

  public static void main(String[] args){

    Runnable threadOne = new ThreadedCode();
    Runnable threadTwo = new ThreadedCode();

    new Thread(threadOne).start();
    new Thread(threadTwo).start();

  }

}
