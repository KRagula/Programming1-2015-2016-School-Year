import java.io.*;
import java.util.ArrayList;
public class VladmirDmitry{
  public static void main(String args[]) throws IOException{
    int i = 0;
    int j = 0;
    int k = 0;
    try (BufferedReader br = new BufferedReader(new FileReader("VladmirDmitry.txt"))) {
      String line;
      while ((line = br.readLine()) != null) {
        // process the line.
        //System.out.println(line);
        i++;
      }
      br.close();
    } catch(IOException e) {
      e.printStackTrace();
    }
    String[] lines = new String[i];
    try (BufferedReader br = new BufferedReader(new FileReader("VladmirDmitry.txt"))) {
      String line;
      while ((line = br.readLine()) != null) {
        // process the line.
        //System.out.println(line);
        lines[j]= line;
        j++;
      }
      br.close();
    } catch(IOException e) {
      e.printStackTrace();
    }
    String politicianName = lines[0];
    String entryEmail = lines[1] + System.lineSeparator() + lines[2] + System.lineSeparator() + lines[3] + System.lineSeparator() + lines[4];
    //System.out.println(entryEmail);
    i=4;
    j=0;
    String fullLine;
    String firstLetters;
    while(i<lines.length){
      fullLine = lines[i];
      firstLetters = fullLine.substring(0,3);
      //System.out.println(firstLetters);
      if(firstLetters.equals("STA")){
        while(!firstLetters.equals("END")){
          fullLine = lines[i];
          firstLetters = fullLine.substring(0,3);
          k++;
          i++;
        }
        System.out.println(k);
        k = 0;
      }
      i++;
    }
  }
}