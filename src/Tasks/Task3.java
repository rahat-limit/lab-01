package Tasks;

import java.util.Scanner;

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
      flag = false;
      return flag;
    }
    if (n % d == 0 && n != d) {
      flag = false;
      return flag;
    }
    if (d == n) {
      return flag;
    }
    return isPrime(n, d + 1);
  }
}
