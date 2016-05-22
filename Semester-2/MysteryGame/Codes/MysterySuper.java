import java.io.*;
import java.util.Random;
//Kanishka Ragula
public class MysterySuper {
  public String culprit;
  public String email;
  public String location;
  public int mysteryNumber;
  public int numberOfMysteries; //Changes with the creation of mysteries
  public String culptrit;
  public String sceneOfCrime;
  public String mysteryType = "";
  int[] mysteriesShown = new int[6];
  
  public void readScript(String fileName) {
    try (BufferedReader br = new BufferedReader(new FileReader("Test.txt"))) {
      String line;
      while ((line = br.readLine()) != null) {
        // process the line.
        System.out.println(line);
      }
      br.close();
    } catch(IOException e) {
      e.printStackTrace();
    }
  }
  public String typeOfMystery(int emailSelection) {
    if(emailSelection == 0) { //Murder
      mysteryType = "Murder";
    } else if(emailSelection == 1) { //Burglary
      mysteryType = "Burglary";
    } else if(emailSelection == 2) { //Political
      mysteryType = "Political";
    }
    return mysteryType;
  }
  public void randomizeMysteriesReceived(){
    Random randomGenerator = new Random();
    for (int i = 1; i <= 6; i++){
      int randomInt = randomGenerator.nextInt(10);
      mysteriesShown[i] = randomInt; //The emails displayed are in the array
    }
  }
  public void chooseMission(int missionNumber) {
    mysteryNumber = missionNumber; //Mystery number gets the value for the mystery chosen
  }
  public String resultsOfDecision(String decision){
    if(decision == culprit){
      return "Congratulation, you have successfully found the correct culprit";
    } else {
      return "You lose, " + decision + " wasn't the culprit, you sent the wrong person to prison";
    }
  }
  
}