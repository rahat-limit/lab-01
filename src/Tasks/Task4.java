package Tasks;
import java.util.Scanner;

public class Task4 {
  public static String task() {
    Scanner scan = new Scanner(System.in);
//  @scan - get user input   
    int n = scan.nextInt();
//  @n get factorial number
    
    return "" + factorial(n);
  }
  public static int factorial(int n) {
    if (n <= 1) {
      return 1;
    }
//  condition get rid of possible errors
    return n * factorial(n - 1);
  }
}
