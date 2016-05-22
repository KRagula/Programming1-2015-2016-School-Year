import java.io.*;

public class BurglaryClass extends MysterySuper {
//  public static void main(String args[]){
    public String findClue;
    public int evidenceNumber=0;
    public int evidenceNumber = 0;
    public String nameOfEvidence;
    public String nameOfSuspect;
    public void findEvidence(String nameOfEvidence){
      if(findEvidence == true){
        System.out.println("You have found some evidence.  The evidence is " + nameOfEvidence );
        evidenceArray[evidenceNumber] = nameOfEvidence;
    }
      
    }
    public void arrestTheCulprit(String suspectName) {
      if(suspectName == true){
        suspectArray[suspectNumber] = suspectName;
        System.out.println("The name of the suspect is correct.  Congratulations, you have successfully solved the case");
      } else {
          System.out.println("The name of your suspect is incorrect, you have arrested and convicted the wrong man");
        }
    }
    // The random mystery selection is part of the Super class so there is no code in here
  }
