import javax.swing.JPanel;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class DetailsPanel extends JPanel {
  public DetailsPanel () {
    Dimension size = getPreferredSize();
    size.width = 250;
    setPreferredSize(size);
    
    setBorder(BorderFactory.createTitledBorder("Johnson"));
    
    JLabel nameLabel = new JLabel("Name: ");
    JLabel occLabel = new JLabel("Occupation: ");
    
    JTextField nameField = new JTextField(10);
    JTextField occField = new JTextField(10);
    
    JButton addBtn = new JButton("Add");
    
    setLayout(new GridBagLayout());
    
    GridBagConstraints gc = new GridBagConstraints();
    
    gc.weightx= 0;
    gc.gridx = 0;
    gc.gridy = 0;
    
    
  }
}
