import java.io.*;
import java.util.ArrayList;
public class VladimirDmitryV2{
  public static void main(String args[]) throws IOException{
    //Intro Reader
    BufferedReader enEmail = new BufferedReader(new FileReader("VladmirDmitryDialogue//EntryEmail.txt"));
    BufferedReader accEmail = new BufferedReader(new FileReader("VladmirDmitryDialogue//AcceptanceEmail.txt"));
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
    String str;
    ArrayList<String> list = new ArrayList<String>();
    while((str = enEmail.readLine()) != null){
      list.add(str);
    }
    String[] entryEmail = list.toArray(new String[0]);
    list.clear();
    while((str = accEmail.readLine()) != null){
      list.add(str);
    }
    String[] accpetanceEmail = list.toArray(new String[0]);
    list.clear();
    while((str = fin.readLine()) != null){
      list.add(str);
    }
    String[] end = list.toArray(new String[0]);
    list.clear();
    while((str = cSceneVis.readLine()) != null){
      list.add(str);
    }
    String[] crimeSceneVisit = list.toArray(new String[0]);
    list.clear();
    while((str = initResearch.readLine()) != null){
      list.add(str);
    }
    String[] initialResearch = list.toArray(new String[0]);
    list.clear();
    while((str = enEmail.readLine()) != null){
      list.add(str);
    }
    String[] AccpetanceEmail = list.toArray(new String[0]);
    list.clear();
    while((str = enEmail.readLine()) != null){
      list.add(str);
    }
    String[] AccpetanceEmail = list.toArray(new String[0]);
    list.clear();
    while((str = enEmail.readLine()) != null){
      list.add(str);
    }
    String[] AccpetanceEmail = list.toArray(new String[0]);
    list.clear();
    while((str = enEmail.readLine()) != null){
      list.add(str);
    }
    String[] AccpetanceEmail = list.toArray(new String[0]);
    list.clear();
    while((str = enEmail.readLine()) != null){
      list.add(str);
    }
    String[] AccpetanceEmail = list.toArray(new String[0]);
    list.clear();
    while((str = enEmail.readLine()) != null){
      list.add(str);
    }
    String[] AccpetanceEmail = list.toArray(new String[0]);
    list.clear();
    while((str = enEmail.readLine()) != null){
      list.add(str);
    }
    String[] AccpetanceEmail = list.toArray(new String[0]);
    list.clear();
    
  }
}