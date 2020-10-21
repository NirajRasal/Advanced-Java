import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JComboBoxDemo extends JApplet implements ItemListener 
{
JLabel jl;
ImageIcon france, germany, italy, japan;
public void init() 
{
 Container contentPane = getContentPane();
contentPane.setLayout(new FlowLayout());
		// Create a combo box and add it to the panel
JComboBox jc = new JComboBox();
jc.addItem("France");
jc.addItem("Germany");
jc.addItem("Italy");
jc.addItem("Japan");
jc.addItemListener(this);
contentPane.add(jc);
// Create label
jl = new JLabel(new ImageIcon("wp1838322.jpg"));
contentPane.add(jl);
}
public void itemStateChanged(ItemEvent ie) 
{
String s = (String)ie.getItem();
jl.setIcon(new ImageIcon(s + ".jpg"));
}
}