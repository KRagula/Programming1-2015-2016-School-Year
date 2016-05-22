import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame {

  public MainFrame(String title) {
     super(title);
     //sets the correct layout
     setLayout(new BorderLayout());
     //creates a text area
     final JTextArea textArea = new JTextArea();
     //creates a button
     JButton button = new JButton("Click me!");
     //creates a second button
     JButton button1 = new JButton("Who are you");
     //c is like a bucket. it takes jframe and adds things to it. 
     Container c = getContentPane();
     //adds everything physically and location in the window.
     c.add(textArea, BorderLayout.CENTER);
     c.add(button, BorderLayout.SOUTH);
     c.add(button1, BorderLayout.NORTH);
     
     //waits for the button to be clicked and then puts Hello to the text area.
     button.addActionListener(new ActionListener() {
       public void actionPerformed(ActionEvent e) {
         textArea.append("Hello\n");
       }
     
     });
     //waits for the button to be clicked and then puts My name is Sidd to the text area.
     button1.addActionListener(new ActionListener() {
       public void actionPerformed(ActionEvent e) {
         textArea.append("My name is Sidd\n");
       }
     });
  }

}
