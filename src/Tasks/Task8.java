package Tasks;
import java.util.Scanner;

public class Task8 {
  public static String loop(String string) {
    String[] list = string.split("");
//  @list - list of letters   
    int len = string.length();
//  @len - number of list elements    
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
//  @scan - get user input   
    String s = scan.nextLine();
//  @scan - get line
    return loop(s);
  }
}
