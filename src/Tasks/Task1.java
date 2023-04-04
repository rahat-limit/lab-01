package Tasks;
import java.util.Scanner;
public class Task1 {
  public static String task() {
    Scanner scan = new Scanner(System.in);
//  @scan - get user input
    int n = scan.nextInt();
//  @n - integer length of array
    int[] array = new int[n];
//  @array - list of integers
    for (int i = 0; i < n; i++) {
      array[i] = scan.nextInt();
    }
    int min = findMinValue(array, n);
//  @min - min value
    return "Minimum is " + min;
  }
  public static int findMinValue(int[] array, int n) {
    if (n==1) {
      return array[0];
//    return last element
    }else {
      int min = findMinValue(array, n - 1);
      return Math.min(min, array[n-1]);
//    return minimum value of 2
    }
  }
}
