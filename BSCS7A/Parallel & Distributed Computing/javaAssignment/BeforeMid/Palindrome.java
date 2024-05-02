import java.util.Scanner;

public class Palindrome {

  public static void main(String[] args) {

    //Launch 10 threads that make the operation with a different number

      Check check=new Check();
      Thread thread=new Thread(check);
      thread.start();/*from  w  w  w .  ja v a  2 s.  co  m*/

  }
}
/**
 *  This class prints the multiplication table of a number
 */
class Check implements Runnable {

  /**
   *  The number
   */

  
  /**
   *  Constructor of the class
   * @param number : The number
   */

  /**
   *  Method that do the calculations
   */
  @Override
  public void run() {

        String a, b = "";
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the string you want to check:");
        a = s.nextLine();
        int n = a.length();
        for(int i = n - 1; i >= 0; i--)
        {
            b = b + a.charAt(i);
        }
        if(a.equalsIgnoreCase(b))
        {
            System.out.println("The string is palindrome.");
        }
        else
        {
            System.out.println("The string is not palindrome.");
        }
  }

}