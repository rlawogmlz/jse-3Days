package oop04.PolymorphismSytax;

public class BananaImpl implements FruitInterface{

	@Override
	public void dispaly(String s) {
		System.out.println(s+" 바나나입니다.");
		
	}
	/*public void dispaly(String s) {
		System.out.println(s+" 바나나입니다.");
	}*/
}
