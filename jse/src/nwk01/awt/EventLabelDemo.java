package nwk01.awt;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class EventLabelDemo {
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
