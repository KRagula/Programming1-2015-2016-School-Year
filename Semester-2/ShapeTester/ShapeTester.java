//Kanishka Ragula
//Shapes Tester
import java.util.Scanner;
public class ShapeTester {
  public static void main(String[] args) {
    System.out.println("What shape do you want to create? Enter in lowercase.  You can make a box, sphere, or pyramid");
    Scanner scanner = new Scanner(System.in);
    String shape = scanner.nextLine();
    if (shape.equals("box")){
      Box box = new Box();
      System.out.println("What is the length of the box?");
      float length1 = scanner.nextFloat();
      System.out.println("What is the width of the box?");
      float width1 = scanner.nextFloat();
      System.out.println("What is the height of the box?");
      float height1 = scanner.nextFloat();
      box.getLength(length1);
      box.getWidth(width1);
      box.getHeight(height1);
      System.out.println("The volume is " + box.volumeMaker());
      System.out.println("The surface area is " + box.surfaceArea());      
    } else if(shape.equals("sphere")) {
      System.out.println("What is the radius of the sphere");
      float radius = scanner.nextFloat();
      Sphere sphere = new Sphere();
      sphere.getRadius(radius);
      System.out.println("The volume is " + sphere.volumeMaker());
      System.out.println("The surface area is " + sphere.surfaceArea());                  
    } else if(shape.equals("pyramid")) {
      Pyramid pyramid = new Pyramid();
      System.out.println("What is the length of the pyramid?");
      float length2 = scanner.nextFloat();
      System.out.println("What is the width of the pyramid?");
      float width2 = scanner.nextFloat();
      System.out.println("What is the height of the pyramid?");
      float height2 = scanner.nextFloat();
      pyramid.getLength(length2);
      pyramid.getWidth(width2);
      pyramid.getHeight(height2);
      System.out.println("The volume is " + pyramid.volumeMaker());
      System.out.println("The surface area is " + pyramid.surfaceArea());      
    }
  }
}