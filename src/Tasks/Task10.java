package Tasks;
import java.util.Scanner;

public class Task10 {
  public static int euclidGCDAlgoReq(int a, int b) {
    if (b == 0) return a;
    return euclidGCDAlgoReq(b, a % b);
  }
  public static String task() {
    Scanner scan = new Scanner(System.in);
    int[] array = new int[2];
    for (int i = 0; i < 2; i++) {
      array[i] = scan.nextInt();
    }
    return euclidGCDAlgoReq(array[0], array[1]) + "";
  }
}
