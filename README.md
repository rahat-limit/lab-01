# First Assignment Documentation
Welcome to my respository, which I created due to ADS lessons. Here you can easily find some tasks with their explanations. Home you like it🤙
## Main File Main.java [(source)](https://github.com/rahat-limit/lab-01/blob/master/src/Main.java/)
**All tasks in lab-01 works the same way. Lines to start each task are commented, only thing is needed to uncomment exact task of various different.**
## ✖️ Task 1 [(source)](https://github.com/rahat-limit/lab-01/blob/master/src/Tasks/Task1.java/)
**Task**
You are given a number “n” and an array of “n” elements, write the function that returns minimum of them.
###Solution###
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


Task 1 - 

Task 2. - You are given a number “n” and an array of “n” elements, write the function that returns average of them.
Task 3. You are given a number “n”, write the function for checking whether“n” is prime.
Task 4. You are given a number “n”, write the program using recursion for finding “n!”
Task 5. You are given a number “n”, write the function for finding n-th elements in Fibonacci sequence using recursion. (Fn = Fn-1+ Fn-2). F0= 0, F1 = 1.
Task 6. You are given numbers “a” and “n”, write the function that returns “an”.
Task 7. You are given a number “n” and an array of “n” elements, write the program that returns given array in reverse order without using array data structure.
Task 8. You are given a string “s”, write the function for checking whether “s” is all consists of digits.
Task 9. You are given numbers“n” and “k”,write the program that
k k k−1 k 0 n finds Cn(binomial coefficient) using formulaCn=Cn−1+Cn−1where Cn=Cn=1.
Task 10. You are given “a” and “b”, write the function for finding GCD(a, b) using recursion. (Hint: Euclidean Algorithm)
