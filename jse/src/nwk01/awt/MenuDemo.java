package nwk01.awt;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MenuDemo {
	public static void main(String[] args) {
		
		Frame frame = new Frame("메모장");
		frame.setSize(500, 300);
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension dim = toolkit.getScreenSize();
		
		MenuBar menuBar = new MenuBar();
		Menu menufile = new Menu("Flie");
		Menu menuEdit = new Menu("Edit");
		Menu menuView = new Menu("View");
		Menu menuHelp = new Menu("Help");
		
		MenuItem itemNew = new MenuItem("New");
		MenuItem itemOpen = new MenuItem("Open");
		/* Menu와 MenuItem의 차이
		 * 자식이 있으면 Menu를 쓰고 
		 * 자식이 없으면 Menuitem를 쓴다
		 */
		Menu subMenu = new Menu("Others");
		MenuItem itemExit = new MenuItem("Exit");
		
		MenuItem submenuPrint = new MenuItem("print");
		MenuItem submenuPriview = new MenuItem("Priview");
		MenuItem submenuSeup = new MenuItem("Setup");
		subMenu.add(submenuPrint);
		subMenu.add(submenuPriview);
		subMenu.add(submenuSeup);
		
		menufile.add(itemNew);
		menufile.add(itemOpen);
		menufile.add(subMenu);
		menufile.addSeparator(); // 구분자 표시
		menufile.add(itemExit);
		
		menuBar.add(menufile);
		menuBar.add(menuEdit);
		menuBar.add(menuView);
		
		
		frame.setLayout(new FlowLayout());
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
