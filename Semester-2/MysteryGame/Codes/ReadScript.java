import java.io.*;
//Kanishka Ragula
//Code for reading the script
//The commented out lines are for when attempting to make methods out of this for the entry point
public class ReadScript {
  public static void main(String [] args) throws IOException{
    /*public*/ String culprit;
    /*public*/ String email;
    
    
    //public void readScript(String fileName) {
      try (BufferedReader br = new BufferedReader(new FileReader("Test.txt"))) {
        String line;
        while ((line = br.readLine()) != null) {
          // process the line.
          System.out.println(line);
        }
        br.close();
      } catch(IOException e) {
        e.printStackTrace();
      }
    }
  }
//}
