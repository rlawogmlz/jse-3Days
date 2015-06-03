package nwk01.awt;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Toolkit;

public class LabelDemo {
	public static void main(String[] args) {
		
	
		Frame frame = new Frame("메모장");
		frame.setSize(500, 300);
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension dim = toolkit.getScreenSize();
		
		Label labId = new Label("ID");
		labId.setBounds(50, 50, 30, 10);
		Label labpwd = new Label("Password");
		labpwd.setBounds(50, 65, 100, 10);
		
		frame.setLayout(null);
		frame.add(labId);
		frame.add(labpwd);
		
		frame.setLocation(dim.width/2,dim.height/2);
		frame.setVisible(true);
	}
}
