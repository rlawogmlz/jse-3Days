package oop04.PolymorphismSytax;

public class FruitMain {
	public static void main(String[] args) {
		//인터페이스는 객체를 만들수 없다.
		FruitInterface apple = new AppleImpl();
		FruitInterface orange; //FruitInterfae 타입의 참조변수를 선언
		orange = new OrangeImpl();	// 클래스 OrangeImpl의 객체를 생성하여 orange에 할당하였다.
		FruitInterface banana = new BananaImpl();
		
		apple.dispaly("맛있는 ");
		orange.dispaly("오래된 ");
		banana.dispaly("비싼 ");
		//orange.getCount();
		//인터페이스에 선언된 메소드만 호출이 가능하다.
	}
}
