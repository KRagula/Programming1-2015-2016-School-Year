import java.io.*;

import java.util.ArrayList;
import java.util.List;







public class PoliticalScriptV2 {
  private String[] affirmativeToRepairShopQuestion;
  private String[] attackMenPushedYouOutCar;
  private String[] doYouWantToAttackMenWhoWillDestroyBank;
  private String[] ifLooksInCloset;
  private String[] ifRepliesDeathToSecretary;
  private String[] ifTellsSecretaryCarl;
  private String[] ifUserFiresBackAfterDrawerScene;
  private String[] ifUserJumpsOffLedge;
  private String[] ifUserSaysLawsuit;
  private String[] ifUserShootsFloda;
  private String[] ifUserTacklesFloda;
  private String[] introduction;
  private String[] negativeToRepairShopYesNoQuestion;
  private String[] userGivesItToCarlson;
  private String[] userLooksInDrawer;
  private String[] userLooksInShelf;
  private String[] userRunsInsteadOfShooting;
  private String[] userTakesItToPhoneRepairShop;
  private String[] waitPatientlyInsteadAttackMenBank;
  public void init() {
    try {
      //BufferedReader enEmail = new BufferedReader(new FileReader("VladmirDmitryDialogue//EntryEmail.txt"));
      BufferedReader aff2RepShopQuestion = new BufferedReader(new FileReader("bin//MurderScript2//AffirmativeToRepairShopQuestion.txt"));
      BufferedReader attackMenPushOutCar = new BufferedReader(new FileReader("bin//MurderScript2//AttackMenWhoPushedYouOutCar.txt"));
      BufferedReader attackMenDestroyBank = new BufferedReader(new FileReader("bin//MurderScript2//DoYouWantToAttackMenWhoWillDestroyBank.txt"));
      BufferedReader lookInCloset = new BufferedReader(new FileReader("bin//MurderScript2//IfLooksInCloset.txt"));
      BufferedReader replyDeath2Secretary = new BufferedReader(new FileReader("bin//MurderScript2//IfRepliesDeathToSecretary.txt"));
      BufferedReader tellSecretaryCarl = new BufferedReader(new FileReader("bin//MurderScript2//IfTellsSecretaryCarl.txt"));
      BufferedReader userFiresBackAfterDrawer = new BufferedReader(new FileReader("bin//MurderScript2//IfUserFiresBackAfterDrawerScene.txt"));
      BufferedReader userJumpsOffLedge = new BufferedReader(new FileReader("bin//MurderScript2//IfUserJumpsOffLedge.txt"));
      BufferedReader userSaysLawsuit = new BufferedReader(new FileReader("bin//MurderScript2//IfUserSaysLawsuit.txt"));
      BufferedReader userShootsFloda = new BufferedReader(new FileReader("bin//MurderScript2//IfUserShootsFloda.txt"));
      BufferedReader introduction = new BufferedReader(new FileReader("bin//MurderScript2//IfUserTacklesFloda.txt"));
      BufferedReader userTacklesFloda = new BufferedReader(new FileReader("bin//MurderScript2//Introduction.txt"));
      BufferedReader neg2RepShopYNQuestion = new BufferedReader(new FileReader("bin//MurderScript2//NegativeToRepairShopYesNoQuestion.txt"));
      BufferedReader userGiveToCarlson = new BufferedReader(new FileReader("bin//MurderScript2//UserGivesItToCarlson.txt"));
      BufferedReader userLookInDrawer = new BufferedReader(new FileReader("bin//MurderScript2//UserLooksInDrawer.txt"));
      BufferedReader userLookInShelf = new BufferedReader(new FileReader("bin//MurderScript2//UserLooksInShelf.txt"));
      BufferedReader runInsteadShooting = new BufferedReader(new FileReader("bin//MurderScript2//UserRunsInsteadOfShooting.txt"));
      BufferedReader takesPhoneRepairShop = new BufferedReader(new FileReader("bin//MurderScript2//UserTakesItToPhoneRepairShop.txt"));
      BufferedReader waitPatientInsteadAttack = new BufferedReader(new FileReader("bin//MurderScript2//WaitPatientlyInsteadAttackMenBank.txt"));
      String str = null;
      List<String> list = new ArrayList<String>();
      while ((str = aff2RepShopQuestion.readLine()) != null) {
        list.add(str);
        
      }
      affirmativeToRepairShopQuestion = list.toArray(new String[list.size()]);
      list.clear();
      while((str = attackMenPushOutCar.readLine()) != null){
        list.add(str);
      }
      attackMenPushedYouOutCar = list.toArray(new String[list.size()]);
      list.clear();
      while((str = attackMenDestroyBank.readLine()) != null){
        list.add(str);
      }
      doYouWantToAttackMenWhoWillDestr oyBank = list.toArray(new String[list.size()]);
      list.clear();
      while((str = initResearch.readLine()) != null){
        list.add(str);
      }
      initialResearch = list.toArray(new String[list.size()]);
      list.clear();
      while((str = initOptionsToCont.readLine()) != null){
        list.add(str);
      }
      optionsToContinue = list.toArray(new String[list.size()]);
      list.clear();
      while((str = polReport.readLine()) != null){
        list.add(str);
      }
      policeReport = list.toArray(new String[list.size()]);
      list.clear();
      while((str = resCriminals.readLine()) != null){
        list.add(str);
      }
      researchCriminals = list.toArray(new String[list.size()]);
      list.clear();
      while((str = suspConv.readLine()) != null){
        list.add(str);
      }
      suspectConversation = list.toArray(new String[list.size()]);
      list.clear();
      while((str = suspInt.readLine()) != null){
        list.add(str);
      }
      suspectInterview = list.toArray(new String[list.size()]);
      list.clear();
      while((str = victResear.readLine()) != null){
        list.add(str);
      }
      victimResearch = list.toArray(new String[list.size()]);
      list.clear();
      while((str = witnTalk.readLine()) != null){
        list.add(str);
      }
      witnessTalk = list.toArray(new String[list.size()]);
      list.clear();
    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }
  
  public String[] getEnd() {
    return end;
  } 
  public String[] getCrimeSceneVisit() {
    return crimeSceneVisit;
  } 
  public String[] getInitialResearch() {
    return initialResearch;
  } 
  public String[] getOptionsToContinue() {
    return optionsToContinue;
  } 
  public String[] getPoliceReport() {
    return policeReport;
  } 
  public String[] getResearchCriminals() {
    return researchCriminals;
  } 
  public String[] getSuspectConversation() {
    return suspectConversation;
  } 
  public String[] getSuspectInterview() {
    return suspectInterview;
  } 
  public String[] getVictimResearch() {
    return victimResearch;
  } 
  public String[] getWitnessTalk() {
    return witnessTalk;
  } 
}
