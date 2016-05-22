import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class SwingLearn {
  public static void main(String[] args) {
    //not needed, recommended to create a new thread
    SwingUtilities.invokeLater(new Runnable(){ 
      public void run() {
        //Creates an actual window called Swing Learn
    JFrame frame = new MainFrame("Swing Learn");
        //sets the size of the frame
    frame.setSize(1000, 700);
        //makes the window visible
    frame.setVisible(true);
      }
    });                              
  }
}
