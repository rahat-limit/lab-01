package Tasks;
import java.util.Scanner;

public class Task6 {
  public static String task() {
    Scanner scan = new Scanner(System.in);
    int[] arr = new int[2];
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
      return a * findPower(a, n - 1);
    }
  }
}
