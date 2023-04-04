package Tasks;

import java.util.Scanner;

public class Task3 {
  public static String task() {
    Scanner scan = new Scanner(System.in);
//  @scan - get user input
    int n = scan.nextInt();
//  n - get input integer
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
