package Tasks;
import java.util.Scanner;

/**
* Function task get input parameters.
* @param n is input number.
* @param arr is an array of fibonacci digits.
* @return this function returns fibonacci number.
*/
/**
* Function fibonacci that returns fibonacci number of variable n.
* @param arr is an array of fibonacci digits.
* @param n is input number
*/

public class Task5 {
  public static String task() {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int[] array = new int[n + 1];
    for (int i = 0; i < n + 1; i++) {
      array[i] = fibonacci(i);
    }
    return array[n] + "";
  }
  public static int fibonacci(int n) {
    if (n == 0) {
      return 0;
    } else if (n == 1) {
      return 1;
    } else {
//    conditions due to avoid possible errors
      return fibonacci(n - 1) + fibonacci(n - 2);
    }
  }
}
