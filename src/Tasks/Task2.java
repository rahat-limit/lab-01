package Tasks;

import java.util.Scanner;

public class Task2 {
  public static String task() {
    Scanner scan = new Scanner(System.in);
//  @scan - get input data
    int n = scan.nextInt();
//  @n - length of list
    int[] array = new int[n];
//  @array - list of integers   
    for (int i = 0; i < n; i++) {
      array[i] = scan.nextInt();
    }
    double average = findAverage(array, n);
    return "Average is " + average;
  }
  public static double findAverage(int[] array, int n) {
    if (n == 1) {
//      condition to last element, if last find average
        return (double)array[n - 1] / (double)array.length;
    } else if (n <= 0) {
      return 0;
//      condition due to avoid errors  
    } else {
  //    find average of each element
        double average = (double)array[n - 1] / (double)array.length;
        double d = findAverage(array, n - 1);
        return Math.round(average + d);
    }
  }
}
