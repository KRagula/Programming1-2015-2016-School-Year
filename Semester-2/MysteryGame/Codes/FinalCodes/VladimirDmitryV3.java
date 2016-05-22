import java.io.*;
import java.util.ArrayList;
public class VladimirDmitryV3{
  
  public void init() throws IOException{
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
    ArrayList<String> list2 = new ArrayList<String>();
    while((str = enEmail.readLine()) != null){
      list.add(str);
    }
    String[] entryEmail = list.toArray(new String[0]);
    list.clear();
    while((str = accEmail.readLine()) != null){
      list2.add(str);
    }
    String[] acceptanceEmail = list2.toArray(new String[0]);
    list.clear();
//    while((str = fin.readLine()) != null){
//      list.add(str);
//    }
//    String[] end = list.toArray(new String[0]);
//    list.clear();
//    while((str = cSceneVis.readLine()) != null){
//      list.add(str);
//    }
//    String[] crimeSceneVisit = list.toArray(new String[0]);
//    list.clear();
//    while((str = initResearch.readLine()) != null){
//      list.add(str);
//    }
//    String[] initialResearch = list.toArray(new String[0]);
//    list.clear();
//    while((str = initOptionsToCont.readLine()) != null){
//      list.add(str);
//    }
//    String[] optionsToContinue = list.toArray(new String[0]);
//    list.clear();
//    while((str = polReport.readLine()) != null){
//      list.add(str);
//    }
//    String[] policeReport = list.toArray(new String[0]);
//    list.clear();
//    while((str = resCriminals.readLine()) != null){
//      list.add(str);
//    }
//    String[] researchCriminals = list.toArray(new String[0]);
//    list.clear();
//    while((str = suspConv.readLine()) != null){
//      list.add(str);
//    }
//    String[] suspectConversation = list.toArray(new String[0]);
//    list.clear();
//    while((str = suspInt.readLine()) != null){
//      list.add(str);
//    }
//    String[] suspectInterview = list.toArray(new String[0]);
//    list.clear();
//    while((str = victResear.readLine()) != null){
//      list.add(str);
//    }
//    String[] victimResearch = list.toArray(new String[0]);
//    list.clear();
//    while((str = witnTalk.readLine()) != null){
//      list.add(str);
//    }
//    String[] witnessTalk = list.toArray(new String[0]);
//    list.clear();
//    
  }
//  public String[] getEmail(){
//    return new String[] {entryEmail[]};//= entryEmail[];
//    
//  }
}