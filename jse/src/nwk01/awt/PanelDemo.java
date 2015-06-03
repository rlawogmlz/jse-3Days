package nwk01.awt;

	import java.awt.Button;
	import java.awt.Color;
	import java.awt.Dimension;
	import java.awt.Frame;
	import java.awt.Panel;
	import java.awt.Toolkit;

public class PanelDemo {
		public static void main(String[] args) {
			/*
			 * [1] 컴포넌트를 만든다. 조립할 객체를 생성한다
			 */
			Frame frame = new Frame("메모장");
			frame.setSize(500, 300);
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			Dimension dim = toolkit.getScreenSize();
			
			Panel panel = new Panel();
			panel.setBackground(Color.YELLOW);
			panel.setSize(100, 100);
			panel.setLocation(50, 50);
			
			Button btnOk = new Button("Ok");
			
			//Toolkit toolkit = Toolkit.getDefaultToolkit();
			//공구상자에서 화면 크기를 조절하는 기능을 가진 객체를 dim에게 주었다
			//Dimension dim = toolkit.getScreenSize();
			
			/*
			 * [3] 컴포넌트를 화면에 띄우기 
			 */
			frame.setLocation(dim.width/2,dim.height/2);
			frame.setVisible(true);
			
			/*
			 * 한글꺠짐 솔루션 ( 해결책)
			 * 프로젝트명 우클릭
			 * > 맨 밑 properties 클릭
			 * > run/debug srtting 클릭
			 * 현재 클래스명 더블클릭
			 * argments 탭 클랙
			 * VM argments 빈공간에
			 * - Dfile.encoding = MS949 입력
			 * 저장후 재실행
			 */
		}

	}


