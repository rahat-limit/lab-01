package Tasks;
import java.util.Scanner;

public class Task7 {
  public static String task() {
    Scanner scan = new Scanner(System.in);
//  @scan - get user input   
    int n = scan.nextInt();
//  @n - length of list
    int[] arr = new int[n];
//  @n - list of integers
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
