package Tasks;

import java.util.Scanner;
/**
* Function task get input parameters.
* @param n is input number
* @return this function determine prime numbers.
*/
/**
* Function isPrime that determine prime numbers.
* @param n is input number
*/

public class Task3 {
  public static String task() {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    if (isPrime(n, 2)) {
      return "Prime";
    } else {
      return "Composite";
    }
  }
  public static boolean isPrime(int n, int d) {
    boolean flag = true;
    if (n <= 1 || d < 2) {
//    condition to determine composite integers
      flag = false;
      return flag;
    }
    if (n % d == 0 && n != d) {
//    condition to determine composite integers
      flag = false;
      return flag;
    }
    if (d == n) {
//    end of recursion   
      return flag;
    }
    return isPrime(n, d + 1);
  }
}
