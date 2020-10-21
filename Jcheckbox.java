import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Jcheckbox extends JApplet
{
JCheckBox cb1,cb2,cb3;
JRadioButton cr1,cr2;
String msg=" ";
public void init()
{
Container cp=getContentPane();
setLayout(new FlowLayout()); 
 cb1=new JCheckBox("android");
 cb2=new JCheckBox("jsp");
 cb3=new JCheckBox("jp2");
 cr1=new JRadioButton("qwerty");
 cr2=new JRadioButton("qwertyuiop");
 cp.add(cb1);
cp.add(cb2);
cp.add(cb3);
cp.add(cr1);
cp.add(cr2);

}

}