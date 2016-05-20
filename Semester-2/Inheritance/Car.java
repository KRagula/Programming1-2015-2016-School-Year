public class Car extends Vehicle {
  private int seatBelts;
  private float trunkSpace;
  String sBeltEvaluation;
  String trunkEval;
  
  public void setCar(int belts, float truck){
    seatBelts = belts;
    trunkSpace = trunk;
  }
  
  public boolean seatSafety() {
    if (seatBelts >= seats) {
      sBeltEvaluation = "Your car has enough seatbelts per person.";
      return true;
    } else {
      sBeltEvaluation = "Your car doesn't have enough seatbelts.  How did the NHTSA approve it in the first place?");
      return false;
    }
  }
  
  public boolean trunkUse() {
    if(trunkSpace > 13.0){
      trunkEval = "Your car has enought trunk space for a family to use";
      return true;
    } else {
      trunkEval = "Your car doesn't have enough trunk space for a family to use";
      return false;
    }
  }
}