//Anthony Brennan ajb286 Bubble Sort
import java.util.Random;
class BubbleSort{
  void bubbleSort(int arr[]){
    int n = arr.length;
    boolean swap = false;
    
    for (int i = 0; i < n-1; i++){
      swap = false;
      for (int j = 0; j < n-i-1; j++){
        if (arr[j] > arr[j+1]){
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
          swap = true;
        }
      }
      if(swap == false)
        break;
    }
  }
  
  void print(int arr[]){
    int n = arr.length;
    for (int i = 0; i < n; i++)
      System.out.print(arr[i] + " ");
    System.out.println();
  }
}