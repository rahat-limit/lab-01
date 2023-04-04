package Tasks;
import java.util.Scanner;
/**
 * Task 1. Contains recursive function min() which finding minimum of given numbers and using 2 parameters arr and n.    .
 * @param arr is an array of received digits of which you need to find minimum digit.
 * @param n is the length of an array of digits.
 * @return this function returns minimum of given numbers.
 */

public class Task1 {
  public static String task() {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int[] array = new int[n];
    for (int i = 0; i < n; i++) {
      array[i] = scan.nextInt();
    }
    int min = findMinValue(array, n);
    return "Minimum is " + min;
  }
  public static int findMinValue(int[] array, int n) {
    if (n==1) {
      return array[0];
//    return last element
    }else {
      int min = findMinValue(array, n - 1);
      return Math.min(min, array[n-1]);
//    return minimum value of 2
    }
  }
}
