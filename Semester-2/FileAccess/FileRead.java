import java.io.*;

public class FileRead{
  public static void main(String args[])throws IOException{
    FileReader fr = new FileReader("C:/Users/9634090/Desktop/Testing.txt"); 
    char [] a = new char[50];
    fr.read(a); // reads the content to the array
    for(char c : a) {
      System.out.print(c); //prints the characters one by one
    }
    
  }
}