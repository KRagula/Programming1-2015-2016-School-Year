//Kanishka Ragula and Vikrant Ragula
//Computer Programming I 4B
import java.util.Scanner;
import java.util.Random;
import java.io.*;
public class ThoughtQuestions {
  public static void main(String[] args) throws IOException{
    String[] thoughtQs = new String [10];
    thoughtQs[0] = "Why is the sky blue?";
    thoughtQs[1] = "Which president had the shortest term? Why?";
    thoughtQs[2] = "Why do sub-atomic particles have so much energy?";
    thoughtQs[3] = "When will we be able to go to the moon again?";
    thoughtQs[4] = "Who will invent the first non-magnetic hoverboard?";
    thoughtQs[5] = "Why is Bill Gates so rich?";
    thoughtQs[6] = "How does Social Security work?";
    thoughtQs[7] = "When will the world stop turning? Why?";
    thoughtQs[8] = "Will the moon every fly away from an orbit around earth? Please explain your answer.";
    thoughtQs[9] = "Knowing what we know today, would Jeb Bush have gone to war in Iraq?";
    Random rand = new Random();
    int x = rand.nextInt(10);
    System.out.println(thoughtQs[x]);
    Scanner scanner = new Scanner(System.in);
    String response = scanner.nextLine();
    WriteResponse w = new WriteResponse();
    w.write(thoughtQs[x], response);
  }
}