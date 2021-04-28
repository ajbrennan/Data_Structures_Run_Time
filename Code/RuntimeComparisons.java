//Anthony Brennan ajb286
import java.util.Random;
import java.awt.*;
class RuntimeComparisons{
  public static void main(String args[]){
    
    long startTime, stopTime;
    long t = 0;
    Random rand = new Random();
    
    int arr1[][] = new int[4][40000];
    for(int i = 0; i < 4; i++){
      int m[] = new int[40000];
      for(int j = 0; j < m.length; j++)
        m[j] = rand.nextInt(99999) + 1;
      arr1[i] = m;
    }
    int arr2[][] = new int[4][80000];
    for(int i = 0; i < 4; i++){
      int m[] = new int[80000];
      for(int j = 0; j < m.length; j++)
        m[j] = rand.nextInt(99999) + 1;
      arr2[i] = m;
    }
    int arr3[][] = new int[4][120000];
    for(int i = 0; i < 4; i++){
      int m[] = new int[120000];
      for(int j = 0; j < m.length; j++)
        m[j] = rand.nextInt(99999) + 1;
      arr3[i] = m;
    }
    int arr4[][] = new int[4][160000];
    for(int i = 0; i < 4; i++){
      int m[] = new int[160000];
      for(int j = 0; j < m.length; j++)
        m[j] = rand.nextInt(99999) + 1;
      arr4[i] = m;
    }
    int arr5[][] = new int[4][200000];
    for(int i = 0; i < 4; i++){
      int m[] = new int[200000];
      for(int j = 0; j < m.length; j++)
        m[j] = rand.nextInt(99999) + 1;
      arr5[i] = m;
    }
    int arr6[][] = new int[4][240000];
    for(int i = 0; i < 4; i++){
      int m[] = new int[240000];
      for(int j = 0; j < m.length; j++)
        m[j] = rand.nextInt(99999) + 1;
      arr6[i] = m;
    }
//////////////////////////////////////////////////////////////////////////////////////////
    int arr1b[][] = new int[4][7500];
    for(int i = 0; i < 4; i++){
      int m[] = new int[7500];
      for(int j = 0; j < m.length; j++)
        m[j] = rand.nextInt(99999) + 1;
      arr1b[i] = m;
    }
    int arr2b[][] = new int[4][15000];
    for(int i = 0; i < 4; i++){
      int m[] = new int[15000];
      for(int j = 0; j < m.length; j++)
        m[j] = rand.nextInt(99999) + 1;
      arr2b[i] = m;
    }
    int arr3b[][] = new int[4][22500];
    for(int i = 0; i < 4; i++){
      int m[] = new int[22500];
      for(int j = 0; j < m.length; j++)
        m[j] = rand.nextInt(99999) + 1;
      arr3b[i] = m;
    }
    int arr4b[][] = new int[4][30000];
    for(int i = 0; i < 4; i++){
      int m[] = new int[30000];
      for(int j = 0; j < m.length; j++)
        m[j] = rand.nextInt(99999) + 1;
      arr4b[i] = m;
    }
    int arr5b[][] = new int[4][37500];
    for(int i = 0; i < 4; i++){
      int m[] = new int[37500];
      for(int j = 0; j < m.length; j++)
        m[j] = rand.nextInt(99999) + 1;
      arr5b[i] = m;
    }
    int arr6b[][] = new int[4][45000];
    for(int i = 0; i < 4; i++){
      int m[] = new int[45000];
      for(int j = 0; j < m.length; j++)
        m[j] = rand.nextInt(99999) + 1;
      arr6b[i] = m;
    }
//////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////
    System.out.println("Run Times for Bubble Sort");
    BubbleSort x = new BubbleSort();
    
    int b1 = 0;
    for(int i = 0; i < 4; i++){
      startTime = System.currentTimeMillis();
      x.bubbleSort(arr1b[i]);
      stopTime = System.currentTimeMillis();
      long l = stopTime - startTime;
      Integer k = (int) (long) l;
      b1 = b1 + k;
    }
    b1 = b1/4;
    System.out.println("N = " + arr1b[0].length + " avg time = " + b1 + "msec");
    
    int b2 = 0;
    for(int i = 0; i < 4; i++){
      startTime = System.currentTimeMillis();
      x.bubbleSort(arr2b[i]);
      stopTime = System.currentTimeMillis();
      long l = stopTime - startTime;
      Integer k = (int) (long) l;
      b2 = b2 + k;
    }
    b2 = b2/4;
    System.out.println("N = " + arr2b[0].length + " avg time = " + b2 + "msec");
    
    int b3 = 0;
    for(int i = 0; i < 4; i++){
      startTime = System.currentTimeMillis();
      x.bubbleSort(arr3b[i]);
      stopTime = System.currentTimeMillis();
      long l = stopTime - startTime;
      Integer k = (int) (long) l;
      b3 = b3 + k;
    }
    b3 = b3/4;
    System.out.println("N = " + arr3b[0].length + " avg time = " + b3 + "msec");
    
  int b4 = 0;
    for(int i = 0; i < 4; i++){
      startTime = System.currentTimeMillis();
      x.bubbleSort(arr4b[i]);
      stopTime = System.currentTimeMillis();
      long l = stopTime - startTime;
      Integer k = (int) (long) l;
      b4 = b4 + k;
    }
    b4 = b4/4;
    System.out.println("N = " + arr4b[0].length + " avg time = " + b4 + "msec");
    
    int b5 = 0;
    for(int i = 0; i < 4; i++){
      startTime = System.currentTimeMillis();
      x.bubbleSort(arr5b[i]);
      stopTime = System.currentTimeMillis();
      long l = stopTime - startTime;
      Integer k = (int) (long) l;
      b5 = b5 + k;
    }
    b5 = b5/4;
    System.out.println("N = " + arr5b[0].length + " avg time = " + b5 + "msec");
    
    int b6 = 0;
    for(int i = 0; i < 4; i++){
      startTime = System.currentTimeMillis();
      x.bubbleSort(arr6b[i]);
      stopTime = System.currentTimeMillis();

      long l = stopTime - startTime;
      Integer k = (int) (long) l;
      b6 = b6 + k;
    }
    b6 = b6/4;
    System.out.println("N = " + arr6b[0].length + " avg time = " + b6 + "msec");
//////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////
    System.out.println("Run Times for Cocktail Sort");
    CocktailSort y = new CocktailSort();
    
    int c1 = 0;
    for(int i = 0; i < 4; i++){
      startTime = System.currentTimeMillis();
      y.cocktailSort(arr1[i]);
      stopTime = System.currentTimeMillis();
      long l = stopTime - startTime;
      Integer k = (int) (long) l;
      c1 = c1 + k;
    }
    c1 = c1/4;
    System.out.println("N = " + arr1[0].length + " avg time = " + c1 + "msec");
    
    int c2 = 0;
    for(int i = 0; i < 4; i++){
      startTime = System.currentTimeMillis();
      y.cocktailSort(arr2[i]);
      stopTime = System.currentTimeMillis();
      long l = stopTime - startTime;
      Integer k = (int) (long) l;
      c2 = c2 + k;
    }
    c2 = c2/4;
    System.out.println("N = " + arr2[0].length + " avg time = " + c2 + "msec");
    
    int c3 = 0;
    for(int i = 0; i < 4; i++){
      startTime = System.currentTimeMillis();
      y.cocktailSort(arr3[i]);
      stopTime = System.currentTimeMillis();
      long l = stopTime - startTime;
      Integer k = (int) (long) l;
      c3 = c3 + k;
    }
    c3 = c3/4;
    System.out.println("N = " + arr3[0].length + " avg time = " + c3 + "msec");
    
    int c4 = 0;
    for(int i = 0; i < 4; i++){
      startTime = System.currentTimeMillis();
      y.cocktailSort(arr4[i]);
      stopTime = System.currentTimeMillis();
      long l = stopTime - startTime;
      Integer k = (int) (long) l;
      c4 = c4 + k;
    }
    c4 = c4/4;
    System.out.println("N = " + arr4[0].length + " avg time = " + c4 + "msec");
    
    int c5 = 0;
    for(int i = 0; i < 4; i++){
      startTime = System.currentTimeMillis();
      y.cocktailSort(arr5[i]);
      stopTime = System.currentTimeMillis();
      long l = stopTime - startTime;
      Integer k = (int) (long) l;
      c5 = c5 + k;
    }
    c5 = c5/4;
    System.out.println("N = " + arr5[0].length + " avg time = " + c5 + "msec");
    
    int c6 = 0;
    for(int i = 0; i < 4; i++){
      startTime = System.currentTimeMillis();
      y.cocktailSort(arr6[i]);
      stopTime = System.currentTimeMillis();
      long l = stopTime - startTime;
      Integer k = (int) (long) l;
      c6 = c6 + k;
    }
    c6 = c6/4;
    System.out.println("N = " + arr6[0].length + " avg time = " + c6 + "msec");
//////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////
    System.out.println("Run Times for Radix Sort");
    RadixSort z = new RadixSort();
    
    int r1 = 0;
    for(int i = 0; i < 4; i++){
      startTime = System.currentTimeMillis();
      z.radixsort(arr1[i]);
      stopTime = System.currentTimeMillis();
      long l = stopTime - startTime;
      Integer k = (int) (long) l;
      r1 = r1 + k;
    }
    r1 = r1/4;
    System.out.println("N = " + arr1[0].length + " avg time = " + r1 + "msec");
    
    int r2 = 0;
    for(int i = 0; i < 4; i++){
      startTime = System.currentTimeMillis();
      z.radixsort(arr2[i]);
      stopTime = System.currentTimeMillis();
      long l = stopTime - startTime;
      Integer k = (int) (long) l;
      r2 = r2 + k;
    }
    r2 = r2/4;
    System.out.println("N = " + arr2[0].length + " avg time = " + r2 + "msec");
    
    int r3 = 0;
    for(int i = 0; i < 4; i++){
      startTime = System.currentTimeMillis();
      z.radixsort(arr3[i]);
      stopTime = System.currentTimeMillis();
      long l = stopTime - startTime;
      Integer k = (int) (long) l;
      r3 = r3 + k;
    }
    r3 = r3/4;
    System.out.println("N = " + arr3[0].length + " avg time = " + r3 + "msec");
    
    int r4 = 0;
    for(int i = 0; i < 4; i++){
      startTime = System.currentTimeMillis();
      z.radixsort(arr4[i]);
      stopTime = System.currentTimeMillis();
      long l = stopTime - startTime;
      Integer k = (int) (long) l;
      r4 = r4 + k;
    }
    r4 = r4/4;
    System.out.println("N = " + arr4[0].length + " avg time = " + r4 + "msec");
    
    int r5 = 0;
    for(int i = 0; i < 4; i++){
      startTime = System.currentTimeMillis();
      z.radixsort(arr5[i]);
      stopTime = System.currentTimeMillis();
      long l = stopTime - startTime;
      Integer k = (int) (long) l;
      r5 = r5 + k;
    }
    r5 = r5/4;
    System.out.println("N = " + arr5[0].length + " avg time = " + r5 + "msec");
    
    int r6 = 0;
    for(int i = 0; i < 4; i++){
      startTime = System.currentTimeMillis();
      z.radixsort(arr6[i]);
      stopTime = System.currentTimeMillis();
      long l = stopTime - startTime;
      Integer k = (int) (long) l;
      r6 = r6 + k;
    }
    r6 = r6/4;
    System.out.println("N = " + arr6[0].length + " avg time = " + r6 + "msec");
//////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////
    int[] x1 = {arr1b[0].length, arr2b[0].length, arr3b[0].length, arr4b[0].length, arr5b[0].length, arr6b[0].length};
    int[] x2 = {arr1[0].length, arr2[0].length, arr3[0].length, arr4[0].length, arr5[0].length, arr6[0].length};
    int[] y1 = {b1,b2,b3,b4,b5,b6};
    int[] y2 = {c1,c2,c3,c4,c5,c6};
    int[] y3 = {r1,r2,r3,r4,r5,r6};
    
    Grapher grapher = new Grapher();
    grapher.graph(x1, y1, Color.BLUE);
    grapher.graph(x2, y2, Color.RED);
    grapher.graph(x2, y3, Color.GREEN);
    grapher.display();
    
    Grapher grapher2 = new Grapher();
    grapher2.graph(x2, y2, Color.RED);
    grapher2.graph(x2, y3, Color.GREEN);
    grapher2.display();
  }
}