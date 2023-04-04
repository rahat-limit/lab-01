package Tasks;
import java.util.Scanner;

/**
* Function task get input parameters.
* @param n is input number.
* @return this function returns factorial number.
*/
/**
* Function factorial that returns factorial number of variable n.
* @param n is input number
*/

public class Task4 {
  public static String task() {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    
    return "" + factorial(n);
  }
  public static int factorial(int n) {
    if (n <= 1) {
      return 1;
    }
//  condition get rid of possible errors
    return n * factorial(n - 1);
  }
}
