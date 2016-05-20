public class Vehicle {
  private int numTires;
  private float fuelCapacity;
  private float mpg;
  private int seats;
  
  public void createVehicle (int tires, float fuelCap, float milesPerG, int seat) {
    numTires = tires;
    fuelCapacity = fuelCap;
    seats = seat;
    mpg = milesPerG;
  }
  public float calcRange(){
    float range = mpg*fuelCapacity;
    return range;
  }
  
}