package Tasks;

import java.util.Scanner;

public class Task2 {
  public static String task() {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int[] array = new int[n];
    for (int i = 0; i < n; i++) {
      array[i] = scan.nextInt();
    }
    double average = findAverage(array, n);
    return "Average is " + average;
  }
  public static double findAverage(int[] array, int n) {
    if (n == 1) {
      return (double)array[n - 1] / (double)array.length;
    } else if (n <= 0) {
      return 0;
    } else {
      double average = (double)array[n - 1] / (double)array.length;
      double d = findAverage(array, n - 1);
      return Math.round(average + d);
    }
  }
}
