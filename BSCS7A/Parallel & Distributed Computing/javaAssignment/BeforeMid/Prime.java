public class Prime {

  public static void main(String[] args) {

    //Launch 10 threads that make the operation with a different number

      Check check=new Check(3);
      Thread thread=new Thread(check);
      thread.start();/*from  w  w  w .  ja v a  2 s.  co  m*/
      Check c=new Check(5);
      Thread t=new Thread(c);
      t.start();

  }
}
/**
 *  This class prints the multiplication table of a number
 */
class Check implements Runnable {

  /**
   *  The number
   */
  private int number;
  
  /**
   *  Constructor of the class
   * @param number : The number
   */
  public Check(int number) {
    this.number=number;
  }
  
  /**
   *  Method that do the calculations
   */
  @Override
  public void run() {


        int i = 2;
        boolean flag = false;
    while (i <= number / 2) {
      // condition for nonprime number
      if (number % i == 0) {
        flag = true;
        break;
      }

      ++i;
    }

    if (!flag)
      System.out.println(number + " is a prime number.");
    else
      System.out.println(number + " is not a prime number.");
  }

}