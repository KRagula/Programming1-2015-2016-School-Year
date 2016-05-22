
import java.io.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class VladimirDmitryV4 {
  private String[] entryEmail;
  
  public void init() {
    try {
      BufferedReader enEmail = new BufferedReader(new FileReader("VladmirDmitryDialogue//EntryEmail.txt"));
      BufferedReader fin = new BufferedReader(new FileReader("VladmirDmitryDialogue//End.txt"));
      BufferedReader cSceneVis = new BufferedReader(new FileReader("VladmirDmitryDialogue//CrimeSceneVisit.txt"));
      BufferedReader initResearch = new BufferedReader(new FileReader("VladmirDmitryDialogue//InitialResearch.txt"));
      BufferedReader initOptionsToCont = new BufferedReader(new FileReader("VladmirDmitryDialogue//OptionsToContinue.txt"));
      BufferedReader polReport = new BufferedReader(new FileReader("VladmirDmitryDialogue//PoliceReport.txt"));
      BufferedReader resCriminals = new BufferedReader(new FileReader("VladmirDmitryDialogue//ResearchCriminals.txt"));
      BufferedReader suspConv = new BufferedReader(new FileReader("VladmirDmitryDialogue//SuspectConversation.txt"));
      BufferedReader suspInt = new BufferedReader(new FileReader("VladmirDmitryDialogue//SuspectInterview.txt"));
      BufferedReader victResear = new BufferedReader(new FileReader("VladmirDmitryDialogue//VictimResearch.txt"));
      BufferedReader witnTalk = new BufferedReader(new FileReader("VladmirDmitryDialogue//WitnessTalk.txt"));
      String thisLine = null;
      List<String> list = new ArrayList<String>();
      while ((thisLine = enEmail.readLine()) != null) {
        list.add(thisLine);
        
      }
      entryEmail = list.toArray(new String[list.size()]);
      list.clear();
    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }
  
  public String[] getEmail() {
    return entryEmail;
  } 
//  public static void main(String[] args) throws Exception {
//    VladimirDmitryV4 test = new VladimirDmitryV4();
//    test.init();
//    System.out.print(test.getEmail());
//    System.out.print(Arrays.toString(test.getEmail()));
//  }
}