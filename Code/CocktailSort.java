//Anthony Brennan ajb286 Cocktail Sort
import java.util.Random;
public class CocktailSort{
  
  void cocktailSort(int arr[]){
    boolean swap = true;
    int start = 0;
    int end = arr.length;
    int forwardCount = 0;
    int backwardCount = 0;
    
    while (swap==true){
      forwardCount++;
      for (int i = start; i < end-1; ++i){
        if (arr[i] > arr[i + 1]){
          int temp = arr[i];
          arr[i] = arr[i+1];
          arr[i+1] = temp;
          swap = true;
        }
        else
          swap = false;
      }

      if (swap==false)
        break;

      swap = false;
      end = end-1;
      
      for (int i = end-1; i >=start; i--){
        if (arr[i] > arr[i+1]){
          int temp = arr[i];
          arr[i] = arr[i+1];
          arr[i+1] = temp;
          swap = true;
        }
      }
      start = start+1;
    }
  }
  
  void print(int arr[]){
    int n = arr.length;
    for (int i = 0; i < n; i++)
      System.out.print(arr[i] + " ");
    System.out.println();
  }
}