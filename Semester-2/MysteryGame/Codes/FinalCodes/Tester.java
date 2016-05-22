import java.io.*;
public class Tester{
  public static void main(String[] args) throws Exception{
    VladimirDmitryV5 test = new VladimirDmitryV5();
//    try {
      test.init();
//    } catch (IOException e) {
//      e.printStackTrace();
//    }
    String[] array1 = test.getEnd();
    for(int i = 0; i<array1.length; i++){
      System.out.println(array1[i]);
    }
  }
  
}