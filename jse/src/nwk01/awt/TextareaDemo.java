package nwk01.awt;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class TextareaDemo {
	public static void main(String[] args) {
		
		
		Frame frame = new Frame("메모장");
		frame.setSize(500, 300);
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension dim = toolkit.getScreenSize();
		
		TextArea area = new TextArea("안녕하세요")
		
		frame.setLayout(new FlowLayout());
		//frame.setLayout(null);
		frame.add(labId);
		frame.add(txtId);
		frame.add(labpwd);
		frame.add(txtPwd);
		
		frame.setLocation(dim.width/2,dim.height/2);
		frame.addWindowListener(new EventHandler());
		frame.setVisible(true);
	}
}

class EventHandler implements WindowListener{

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		//윈도우 닫기 버튼을 클릭햇을경우
		e.getWindow().setVisible(true);
		e.getWindow().dispose();
		System.exit(0);
		
	
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

}


