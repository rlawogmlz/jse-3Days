package nwk01.awt;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;

/*
 * AWT ( Abstract Windows Toolkit)
 * : GUI (Graphic User Interface ) 환경의 프로그램 및 안드로이드 웨젯과 비슷
 * 컴포넌트 : 사용자 인터페이스를 구성하는 기본 요소.
 * 		버튼, ㅊ[크박스,레이블,텍스트필드,히스트,팝업메뉴와 같은 
 * 부속품의 총칭. 자바에서는 Component 클래스가 있는데 모든 콤퍼넌트는 이 Compinent의 자손이다 
 * 컨테이너 : Compinent 으 ㅣ후손중에서 Comtainer 라는 클래스가 있는데 그 클래스와 자손을 지칭한다. 컨테이너는 컨포넌트 부탁을하는 예를 들면 
 * 윈도우 같은 것을 말하며 윈도우,프래임,패널,다이얼로그 박스등이 있다
 * ( 다른 컴포넌트 들을 담을 수 있는 컴포넌트)
 * 레이아웃 : 컴테이너 컴포넌트를 붙일 때 어떤 식으로 배치하는 가가 중요한데 이것을 레이아웃이라고 한다 
 * 이번트 : 사용자로 부터 입력이 일어나고 그에따라 반응 하도록 설계하는 모든 기능을 말한다 
 */
public class FrameDemo {
	public static void main(String[] args) {
		/*
		 * [1] 컴포넌트를 만든다. 조립할 객체를 생성한다
		 */
		Frame frame = new Frame("메모장");
		frame.setSize(500, 300);
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		//공구상자에서 화면 크기를 조절하는 기능을 가진 객체를 dim에게 주었다
		Dimension dim = toolkit.getScreenSize();
		
		/*
		 * [2] 컴포넌트를 화면에 띄우기 
		 */
		frame.setLocation(dim.width/2,dim.height/2);
		/*
		 * 프레임의 좌표값에 따라 화면에 보여지는데 
		 * 위방식처럼하면 고정된 위치가 아닌 화면 크기에 따라 ㅈ
		 * 동적으로 변화한다. 즉, 14인치 화면이든 6인치 스마트폰이든 
		 * 가운데 쯤에 프레임이 보여지게 된다
		 * 
		 */
		frame.setVisible(true);
	}

}
