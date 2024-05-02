 import java.lang.Math;
 import java.util.Random;
 class Main {

  public static void main(String[] args) {

    //Launch 10 threads that make the operation with a different number

      // Calculator calculator=new Calculator(Math.random());
      // Thread thread=new Thread(calculator);
      // thread.start();/*from  w  w  w .  ja v a  2 s.  co  m*/
      Random r = new Random();
      Calculator c=new Calculator(r.nextInt(100));
      Thread t=new Thread(c);
      t.start();

  }
}
/**
 *  This class prints the multiplication table of a number
 */
class Calculator implements Runnable {

  /**
   *  The number
   */
  private int number;
  
  /**
   *  Constructor of the class
   * @param number : The number
   */
  public Calculator(double number) {
    this.number= (int)number;
  }
  
  /**
   *  Method that do the calculations
   */
  @Override
  public void run() {
    for (int i=1; i<=10; i++){
      System.out.printf("%s: %d * %d = %d\n",Thread.currentThread().getName(),number,i,i*number);
      
    }
  }

}