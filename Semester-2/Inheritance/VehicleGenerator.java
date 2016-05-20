import java.util.Scanner;
public class VehicleGenerator {
  public static void main(String args[]){
    System.out.println("Hello, welcome to VehicleGenerator! Do you want to generate a car or motorcycle?");
    Scanner scanner = new Scanner(System.in);
    String vehicle = scanner.nextLine();
    System.out.println("How many tires does your vehicle have?");
    int tires = scanner.nextInt();
    System.out.println("How many gallons of fuel can your vehicle carry?");
    float fuelCap = scanner.nextFloat();
    System.out.println("What is your vehicle's miles per gallon?");
    float mpg = scanner.nextFloat();
    System.out.println("How many people can sit in your vehicle?");
    int people = scanner.nextInt();
    if (vehicle.equals("car")) {
      Car car = new Car();
      car.createVehicle(tires, fuelCap, mpg, people);
      System.out.println("Your can can go "+ car.calcRange() + " miles on a full tank of fuel");
    } else if (vehicle.equals("motorcycle")){
      
    } else {
      System.out.println("Please select a car or motorcycle and spell it like the way it was spelled above in lowercase and no spaces");
    }
  }
}