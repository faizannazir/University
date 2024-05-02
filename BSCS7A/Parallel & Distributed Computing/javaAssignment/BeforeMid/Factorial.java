
public class Factorial {

  public static void main(String[] args) {

    //Launch 10 threads that make the operation with a different number

      Calculator calculator=new Calculator(10);
      Thread thread=new Thread(calculator);
      thread.start();/*from  w  w  w .  ja v a  2 s.  co  m*/
      Calculator c=new Calculator(5);
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
  public Calculator(int number) {
    this.number=number;
  }
  
  /**
   *  Method that do the calculations
   */
  @Override
  public void run() {


        int i = 1;
        long factorial = 1;
        while(i <= number)
        {
            factorial *= i;
            i++;
        }
        System.out.printf("Factorial of %d = %d \n", number, factorial);
  }

}