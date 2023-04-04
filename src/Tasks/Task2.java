package Tasks;

import java.util.Scanner;
/**
* Function task get input parameters.
* @param arr is an array of received digits of which you need to find minimum digit.
* @param n is the length of an array of digits.
* @return this function returns minimum of given numbers.
*/
/**
* Function findAverage that returns average of array.
* @param arr is an array of received digits of which you need to find minimum digit.
* @param n is the length of an array of digits.
*/

public class Task2 {
  public static String task() {
    Scanner scan = new Scanner(System.in);
//  @param scan - get input data
    int n = scan.nextInt();
//  @param n - length of list
    int[] array = new int[n];
//  @param array - list of integers   
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
//      condition due to avoid errors  
        return 0;
    } else {
  //    find average of each element
        double average = (double)array[n - 1] / (double)array.length;
        double d = findAverage(array, n - 1);
        return Math.round(average + d);
    }
  }
}
