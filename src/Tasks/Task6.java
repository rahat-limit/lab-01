package Tasks;
import java.util.Scanner;

/**
* Function task get input parameters.
* @param n is input number.
* @param n is input number
* @param arr is an arr of input digits.
* @return this function returns powered number.
*/
/**
* Function findPower that returns fibonacci number of variable n.
* @param arr is an arr of input digits.
* @param n is input number
* @param a is input number
*/


public class Task6 {
  public static String task() {
    Scanner scan = new Scanner(System.in);
//  @scan - get user input   
    int[] arr = new int[2];
//  @arr - list of 2 integers 
    for (int i = 0; i < 2; i++) {
      arr[i] = scan.nextInt();
    }
    return "" + findPower(arr[0], arr[1]);
  }
  public static int findPower(int a, int n) {
    if (a == 0) {
      return 0;
    } else if (a == 1 || n == 0) {
      return 1;
    } else if (n == 1) {
      return a;
    } else {
//    conditions due to avoid possible errors
      return a * findPower(a, n - 1);
    }
  }
}
