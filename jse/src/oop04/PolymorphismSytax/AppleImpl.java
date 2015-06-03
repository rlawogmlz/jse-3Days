package oop04.PolymorphismSytax;

public class AppleImpl implements FruitInterface {
	// 인터페이스를 구현한다.
	@Override
	public void dispaly(String s) {
		System.out.println(s + " 사과입니다.");
		
	}
}
