package oop04.PolymorphismSytax;

public class OrangeImpl implements FruitInterface{
	
	
	public int getCount(){
		return 100;
	}

	@Override
	public void dispaly(String s) {
		System.out.println(s +"오랜지 입니다");
		
	}
}
