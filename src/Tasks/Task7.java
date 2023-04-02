package Tasks;
import java.util.Scanner;

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
      return "";
    } else {
      reverse(n + 1, arr);
      System.out.print(arr[n] + " ");
      return "";
    }
  }
}
