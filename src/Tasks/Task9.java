package Tasks;
import java.util.Scanner;

public class Task9 {
  public static int binCoefficient(int n, int k) {
    if (k == n) return 1;

    return switch (k) {
      case 0 -> 1;
      default -> binCoefficient(n-1, k-1) + binCoefficient(n-1, k);
    };
  }
  public static String task() {
    Scanner scan = new Scanner(System.in);
    int[] array = new int[2];
    for (int i = 0; i < 2; i++) {
      array[i] = scan.nextInt();
    }
    return binCoefficient(array[0], array[1]) + "";
  }
}
