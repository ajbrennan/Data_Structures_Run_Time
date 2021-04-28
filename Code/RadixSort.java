//Anthony Brennan ajb286 Radix Sort
import java.io.*;
import java.util.*;
import java.util.Random;

class RadixSort {
  
  static void radixsort(int arr[]){
    int n = arr.length;
    int x = getMax(arr, n);

    for (int i = 1; x/i > 0; i *= 10){
      countSort(arr, n, i);
    }
  }
  
  static int getMax(int arr[], int n){
    int max = arr[0];
    for (int i = 1; i < n; i++)
      if (arr[i] > max)
      max = arr[i];
    return max;
  }
  
  static void countSort(int arr[], int n, int exp){
    int output[] = new int[n];
    int i;
    int count[] = new int[10];
    Arrays.fill(count,0);
    
    for (i = 0; i < n; i++)
      count[(arr[i]/exp)%10]++;
    
    for (i = 1; i < 10; i++)
      count[i] += count[i - 1];
    
    for (i = n - 1; i >= 0; i--){
      output[count[(arr[i]/exp)%10]-1] = arr[i];
      count[(arr[i]/exp)%10]--;
    }

    for (i = 0; i < n; i++)
      arr[i] = output[i];
  }
  
  void print(int arr[]){
    int n = arr.length;
    for (int i = 0; i < n; i++)
      System.out.print(arr[i] + " ");
    System.out.println();
  }
}