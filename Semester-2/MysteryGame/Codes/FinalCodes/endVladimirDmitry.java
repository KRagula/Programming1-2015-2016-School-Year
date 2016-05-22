import java.util.Scanner;

public class endVladimirDmitry{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("");
    System.out.println("Who orchestrated the explosion?");
    System.out.println("1. John Johnson and Carl Sanders");
    System.out.println("2. A GRU Agent");
    System.out.println("3. Sergei Barchev");
    System.out.println("4. The Molotov Brothers");
    int a = scanner.nextInt();
    
    
    System.out.println("What was the motive?");
    System.out.println("1. Patriotism");
    System.out.println("2. Corruption and foreign influence");
    System.out.println("3. Personal interests");
    System.out.println("4. Hired help");
    int b = scanner.nextInt();
    
    System.out.println("Who supplied the bomb?");
    System.out.println("1. The CIA");
    System.out.println("2. Mossad");
    System.out.println("3. The Molotov Brothers");
    System.out.println("4. A weapons dealer in Murmansk");
    int c = scanner.nextInt();
    
    System.out.println("Who provided funding?");
    System.out.println("1. Zhukov");
    System.out.println("2. Sergei Barchev");
    System.out.println("3. A Swiss Hedgefund");
    System.out.println("4. Ivanovich");
    int d = scanner.nextInt();
    
    System.out.println("Who organized the bombing?");
    System.out.println("1. The CIA");
    System.out.println("2. Mossad");
    System.out.println("3. Anarchists");
    System.out.println("4. Opponents of Dmitry in the next election");
    int e = scanner.nextInt();
    
    System.out.println("Who hired the men needed to bomb Dmitry?");
    System.out.println("1. Mossad");
    System.out.println("2. The CIA");
    System.out.println("3. FSB");
    System.out.println("4. Vasilly");
    int f = scanner.nextInt();
    
    System.out.println("How did the bomb get into the hotel?");
    System.out.println("1. Dropped off by the Molotov Brothers");
    System.out.println("2. Dropped off by the CIA agents");
    System.out.println("3. Dropped off by Sergei Barchev");
    System.out.println("4. Taken there by the man who orchestrated the bombing");
    int g = scanner.nextInt();
    
//    System.out.println("Are you certain of these answers?");
//    System.out.println("1. Yes");
//    System.out.println("2. Not, let me change them");
//    int h = scanner.nextInt();
    
    if(a == 2 && b == 2 && c == 1 && d == 1 && e == 1 && f == 1 && g == 2){
      System.out.println("Congratulations you have one the game, you are the best detective ever.");
    } else{
      System.out.println("Because you selected a wrong answer, you convicted an innocent person so therefore, you lose.");
    }
  }
}
