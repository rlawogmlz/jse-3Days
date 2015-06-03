package nwk01.awt;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.Toolkit;

public class ButtonDemo {
		public static void main(String[] args) {
			/*
			 * [1] 컴포넌트를 만든다. 조립할 객체를 생성한다
			 */
			Frame frame = new Frame("메모장");
			frame.setSize(500, 300);
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			Dimension dim = toolkit.getScreenSize();
			
			Button btnOk = new Button("확인");
			btnOk.setSize(100, 50);
			btnOk.setBackground(Color.blue);
			btnOk.setLocation(100, 75);
			
			frame.setLayout(null);
			frame.add(btnOk);
			/*
			 * [2] 컴포넌트를 화면에 띄우기 
			 */
			frame.setLocation(dim.width/2,dim.height/2);
			
			frame.setVisible(true);
		
		}
}
