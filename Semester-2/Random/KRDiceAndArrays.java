import java.util.Random;
import java.util.Scanner;
public class KRDiceAndArrays {
  public static void main(String[] args) {
    Random rand = new Random();
    Scanner scanner = new Scanner(System.in);
    System.out.println("Number of Dice");
    String strNumberOfDice = scanner.nextLine();
    System.out.println("Number of Sides Per Dice");
    String strNumberOfSides = scanner.nextLine();
    int numberOfSides = Integer.parseInt(strNumberOfSides);
    int numberOfDice = Integer.parseInt(strNumberOfDice);
    int[] diceSides = new int[numberOfSides];
    int n = 0;
    for (int i = 0; i < diceSides.length; i++) {
      diceSides[i] = i+1;
    }
    int[] dice1 = new int[numberOfDice];
    for (int i = 0; i < dice1.length; i++) {
      n = rand.nextInt(numberOfSides);
      int j = i+1;
      dice1[i] = diceSides[n];
      System.out.println("Rolling... Rolling... Dice has finished Rolling!");
      System.out.println("Die " + j + " rolls " + dice1[i]);
    }
  }
}
