import java.io.*;
public class FileWrite{
  public static void main(String args[])throws IOException{
    File file = new File("Test1.txt");
    FileWriter writer = new FileWriter(file);
    writer.write("Testing, 1,2,3 testing");
    writer.flush();
    writer.close();
    FileReader fr = new FileReader(file); 
    char [] a = new char[50];
    fr.read(a); // reads the content to the array
    for(char c : a) {
      System.out.print(c); //prints the characters one by one
    }
    fr.close();
  }
}