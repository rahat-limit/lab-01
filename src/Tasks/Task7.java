package Tasks;
import java.util.Scanner;
/**
* Function task get input parameters.
* @param n is input number.
* @param arr is an arr of input digits.
* @return this function returns reversed list of numbers.
*/
/**
* Function reverse that returns reversed list of numbers.
* @param arr is an arr of input digits.
* @param n is input number
*/

public class Task7 {
  public static String task() {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scan.nextInt();
    }
    reverse(0, arr);
    return "";
  }
  public static String reverse(int n, int[] arr) {
    if (n == arr.length) {
//    condition to stop recursion
      return "";
    } else {
      reverse(n + 1, arr);
      System.out.print(arr[n] + " ");
//    print each integer of reversed list
      return "";
    }
  }
}
