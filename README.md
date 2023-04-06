# First Assignment Documentation
Welcome to my respository, which I created due to ADS lessons. Here you can easily find some tasks with their explanations. Hope you like it🤙
## Main File Main.java [(source)](https://github.com/rahat-limit/lab-01/blob/master/src/Main.java/)
**All tasks in lab-01 works the same way. Lines to start each task are commented, only thing is needed to uncomment exact task of various different.**
## ✖️ Task 1 [(source)](https://github.com/rahat-limit/lab-01/blob/master/src/Tasks/Task1.java/)
### Task:
You are given a number “n” and an array of “n” elements, write the function that returns minimum of them.
### Explanation:
Function **findMinValue(int[] array, int n)** takes input array and its length and returns minimum in the array using recursion. If the current index n is 1 then set minimum=array[0] and return minimum. Else set minimum = minimum of array[n] or findMinValue(array,n-1) and return it.
### Solution:
```java
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
```
## ✖️ Task 2 [(source)](https://github.com/rahat-limit/lab-01/blob/master/src/Tasks/Task2.java/)
### Task:
You are given a number “n” and an array of “n” elements, write the function that returns average of them.
### Explanation:
Function **findAverage(int[] array, int n)** takes input array and its length and returns average of each two elements in the array using recursion and during recursion sum up to get Average of an array. If the current index n is 1 then set (double)array[n - 1] / (double)array.length; else if n <= 0 then return 0. Else set (double)array[n - 1] / (double)array.length; or findAverage(array, n-1) and return it.
### Solution:
```java
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
```
## ✖️ Task 3 [(source)](https://github.com/rahat-limit/lab-01/blob/master/src/Tasks/Task3.java/)
### Task:
You are given a number “n”, write the function for checking whether“n” is prime.
### Explanation:
Function **isPrime(int n, int d)** takes input integer and its index and returns boolean value using recursion. If the current n <= 1 or index < 2 then return flag = false. Else If n % index == 0 and n != index set flag = false, return flag. Else if n == index return flag. Finally after couple of conditions return function isPrime(n, d + 1).
### Solution:
```java
public static boolean isPrime(int n, int d) {
  boolean flag = true;
  if (n <= 1 || d < 2) {
//    condition to determine composite integers
    flag = false;
    return flag;
  }
  if (n % d == 0 && n != d) {
//    condition to determine composite integers
    flag = false;
    return flag;
  }
  if (d == n) {
//    end of recursion   
    return flag;
  }
  return isPrime(n, d + 1);
}
```
## ✖️ Task 4 [(source)](https://github.com/rahat-limit/lab-01/blob/master/src/Tasks/Task4.java/)
### Task:
You are given a number “n”, write the program using recursion for finding “n!”
### Explanation:
Function **factorial(int n)** takes input integer and returns factorial of n-integer using recursion. If the current index n is <= 1 return 1. Else return n * factorial(n - 1).
### Solution:
```java
public static int factorial(int n) {
    if (n <= 1) {
      return 1;
    }
//  condition get rid of possible errors
    return n * factorial(n - 1);
}
```
## ✖️ Task 5 [(source)](https://github.com/rahat-limit/lab-01/blob/master/src/Tasks/Task5.java/)
### Task:
You are given a number “n”, write the function for finding n-th elements in Fibonacci sequence using recursion. (Fn = Fn-1+ Fn-2). F0= 0, F1 = 1.
### Explanation:
Function **fibonacci(int n)** takes input integer returns n-th element of array of fibonacci numbers using recursion. If the current index n is 0 then 0 or n is 1 return 1. Else return fibonacci(n - 1) + fibonacci(n - 2) to find fibonacci number;
### Solution:
```java
public static int fibonacci(int n) {
  if (n == 0) {
    return 0;
  } else if (n == 1) {
    return 1;
  } else {
//    conditions due to avoid possible errors
    return fibonacci(n - 1) + fibonacci(n - 2);
  }
}
```

Task 6. You are given numbers “a” and “n”, write the function that returns “an”.
Task 7. You are given a number “n” and an array of “n” elements, write the program that returns given array in reverse order without using array data structure.
Task 8. You are given a string “s”, write the function for checking whether “s” is all consists of digits.
Task 9. You are given numbers“n” and “k”,write the program that
k k k−1 k 0 n finds Cn(binomial coefficient) using formulaCn=Cn−1+Cn−1where Cn=Cn=1.
Task 10. You are given “a” and “b”, write the function for finding GCD(a, b) using recursion. (Hint: Euclidean Algorithm)
