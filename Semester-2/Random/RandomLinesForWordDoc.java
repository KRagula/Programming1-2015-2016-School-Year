import java.util.*;
public class RandomLinesForWordDoc {
  public static void main(String[] args) {
    Random rand = new Random();
//    
//    int numbers[] = {0,1,2,3,4,5,6,7,8,9};
//    numbers[0] = 5;
    int[] myArray = new int[99];
    for (int i = 0; i < myArray.length; i++) {
      int n = rand.nextInt(99) +1;
      myArray[i] = n;
      System.out.println(myArray[i]);
    }
//    int index = numbers.length;
//    for (int i = 0; i< index; i++) {
//      System.out.println(numbers[i]);
//    }
//    System.out.println(numbers[1]);
  }
}