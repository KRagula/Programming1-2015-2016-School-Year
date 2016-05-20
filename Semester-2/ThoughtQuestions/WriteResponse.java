import java.io.*;
public class WriteResponse{
  private String question;
  private String answer;
  public WriteResponse() {
    question = "";
    answer = "";
  }
  public void write(String q, String a) throws IOException{
    try(PrintWriter add = new PrintWriter(new BufferedWriter(new FileWriter("responses.txt",true)))){
      add.println(q);
      add.println(a);
    }catch (IOException e) {
    }
  }
}