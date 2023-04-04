package Tasks;
import java.util.Scanner;

/**
* Function euclidGCDAlgoReq get input parameters.
* @return this function returns int GCD.
*/
/**
* Function task get input parameters.
* @param array is list of integers due to .
* @return this function returns String due to Function euclidGCDAlgoReq.
*/

public class Task10 {
  public static int euclidGCDAlgoReq(int a, int b) {
    if (b == 0) return a;
//  return initial value if b == 0
    return euclidGCDAlgoReq(b, a % b);
//  find great common divisor by recursion
  }
  public static String task() {
    Scanner scan = new Scanner(System.in);
//  scan - get user input
    int[] array = new int[2];
//  array - list of 2 integers
    for (int i = 0; i < 2; i++) {
      array[i] = scan.nextInt();
    }
    return euclidGCDAlgoReq(array[0], array[1]) + "";
  }
}
