package nwk01.awt;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Toolkit;

public class FontDemo {
	public static void main(String[] args) {
		
	
		Frame frame = new Frame("메모장");
		frame.setSize(500, 300);
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension dim = toolkit.getScreenSize();
		
		Label labId = new Label("Good Bye, java..Hello jsp");
		labId.setBounds(50, 50, 30, 10);
		
		
		frame.setLayout(null);
		frame.add(labId);
		
		Font plain = new Font("Serif",Font.PLAIN, 20);
		Font italic = new Font("Serif",Font.ITALIC, 20);
		Font bold = new Font("Serif",Font.BOLD, 20);
		Font boldItalic = new Font("Serif",Font.BOLD+Font.ITALIC, 20);
		
		labId.setFont(boldItalic);
		frame.setLayout(new FlowLayout());
		
		frame.setLocation(dim.width/2,dim.height/2);
		frame.setVisible(true);
	}

}
