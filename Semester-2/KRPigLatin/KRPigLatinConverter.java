import java.util.Scanner;
import java.util.*;

public class KRPigLatinConverter {
  public static void main(String args[]){
    System.out.println("What phrase do you want to be turned to Pig Latin?");
    Scanner scanner = new Scanner(System.in);
    String fullPhrase = scanner.nextLine();
    fullPhrase = fullPhrase.toLowerCase();
    int i = 0;
    String[] parts = fullPhrase.split(" ");
    String convertedPhrase = " ";
    String newWord = " ";
    while (i < parts.length) {
    String  fullWord = parts[i];
    String firstLetter = fullWord.substring(0,1);
    String restOfWord = fullWord.substring(1);
    char char1;
    char1 = fullWord.charAt(0);
    boolean isVowel = char1 == 'a' || char1 == 'e' || char1 == 'i' || char1 == 'o' || char1 == 'u';
    if (i == 0) {
      String newFirstLetter = restOfWord.substring(0,1);
      newFirstLetter = newFirstLetter.toUpperCase();
      restOfWord = restOfWord.substring(1);
      restOfWord = newFirstLetter + restOfWord;
    }
    if(isVowel) {
      newWord = fullWord + "yay";
    } else {
      newWord = restOfWord + firstLetter + "ay";
    }
    convertedPhrase = convertedPhrase + " " + newWord;
    i++;
    }
    System.out.println(convertedPhrase);
   }
}
