// Inner class demo.
import java.applet.*;
import java.awt.event.*;

public class InnerClassDemo extends Applet 
{
	public void init() 
	{
	addMouseListener(new MyMouseAdapter());
	}
		class MyMouseAdapter extends MouseAdapter 
		{
			public void mousePressed(MouseEvent me)
			{
			showStatus("Mouse Pressed");
			}
		}
}
