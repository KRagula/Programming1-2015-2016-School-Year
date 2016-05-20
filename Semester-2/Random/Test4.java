import java.util.Random;
import java.util.Scanner;
public class Test4 {
  public static void main(String[] args) {
    Random rand = new Random();
    Scanner scanner = new Scanner(System.in);
    System.out.println("Number of Dice");
    int numberOfDice = scanner.nextline();
    System.out.println("Number of Sides Per Dice");
    int numberOfSides
    int diceSides[] = {1,2,3,4,5,6};
    int[] diceSides = new int[numberOfSides];
    for (int i = 0; i < diceSides.length; i++) {
      int n = rand.nextInt(5) +1;
      myArray[i] = randomNumbers[n];
      System.out.println(myArray[i]);
    }
  }
}
