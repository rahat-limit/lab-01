package Tasks;
import java.util.Scanner;

public class Task9 {
  public static int binCoefficient(int n, int k) {
    if (k == n) return 1;
//  return 1 in case k == n, due to formula C(n,k) = n! / ((n-k)! * k!)
    return switch (k) {
      case 0 -> 1;
//  return 1 in case k == 0, due to formula C(n,k) = n! / ((n-k)! * k!)
      default -> binCoefficient(n-1, k-1) + binCoefficient(n-1, k);
    };
  }
  public static String task() {
    Scanner scan = new Scanner(System.in);
//  @ scan - get user input   
    int[] array = new int[2];
//  @ array - list of 2 integers   
    for (int i = 0; i < 2; i++) {
      array[i] = scan.nextInt();
    }
    return binCoefficient(array[0], array[1]) + "";
  }
}
