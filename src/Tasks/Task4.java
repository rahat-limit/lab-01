package Tasks;
import java.util.Scanner;

public class Task4 {
  public static String task() {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    return "" + factorial(n);
  }
  public static int factorial(int n) {
    if (n <= 1){
      return 1;
    }
    return n * factorial(n - 1);
  }
}
