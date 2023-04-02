package Tasks;
import java.util.Scanner;
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
    }else {
      int min = findMinValue(array, n - 1);
      return Math.min(min, array[n-1]);
    }
  }
}
