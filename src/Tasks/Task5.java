package Tasks;
import java.util.Scanner;

public class Task5 {
  public static String task() {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int[] array = new int[n + 1];
    for (int i = 0; i < n + 1; i++) {
      array[i] = fibonacci(i);
    }
    return array[n] + "";
  }
  public static int fibonacci(int n) {
    if (n == 0) {
      return 0;
    } else if (n == 1) {
      return 1;
    } else {
      return fibonacci(n - 1) + fibonacci(n - 2);
    }
  }
}
