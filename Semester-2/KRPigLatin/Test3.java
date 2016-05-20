import java.util.Scanner;
import java.util.*;

public class Test3 {
  public static void main(String args[]){
    System.out.println("Enter input:");
    Scanner scanner = new Scanner(System.in);
    String fullName = scanner.nextLine();
    //String fullName = "Kanishka Ragula";
    String[] parts = fullName.split(" ");
    for (int index = 0; index < parts.size(); index++) {
//    String firstName = parts[0];
//    String lastName = parts[1];
//    System.out.println(firstName);
//    System.out.println(lastName);
      String display = parts[i];
      System.out.println(display);
    }
   }
}
