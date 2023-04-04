package Tasks;
import java.util.Scanner;
/**
* Function task get input parameters.
* @param s is input String.
* @return this function returns String.
*/
/**
* Function isNum that returns boolean depends on number of non-digit char.
* @param s is input String
* @return this function returns boolean.
*/
/**
* Function loop that returns boolean depends on number of non-digit char.
* @param s is input number
* @param list - list of letters
* @param len - length of string
* @return this function returns String.
*/
/**
* Function recFunction that returns String depends on number of non-digit char.
* @param s is input number
* @return this function returns String.
*/

public class Task8 {
  public static String loop(String string) {
    String[] list = string.split("");
    int len = string.length();
    return recFunction(list, 0, len);
  }
  static String recFunction(String[] arr, int pos,  int stop) {
    if (pos < stop) {
//    condition to stop recursion   
      if (isNum(arr[pos])) {
        return recFunction(arr, ++pos, stop);
      } else {
        return "No";
      }
    }
    return "Yes";
  }
  static boolean isNum(String s) {
    try {
      Integer.parseInt(s);
      return true;
//    Condition check is number format   
    } catch (NumberFormatException e) {
      return false;
    }
  }
  public static String task() {
    Scanner scan = new Scanner(System.in);
    String s = scan.nextLine();
    return loop(s);
  }
}
