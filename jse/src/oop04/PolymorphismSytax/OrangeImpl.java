package oop04.PolymorphismSytax;

public class OrangeImpl implements FruitInterface{
	
	
	public int getCount(){
		return 100;
	}
	/*
	 * 아래 메소드는 개발자가 임의로 작성한 것입니다.
	 * 이 예제를 든 이유는 아무리 개발자가 임의로 메소들를 
	 * 추가하여도 Main() 에서는 사용할 수 없으므로 
	 * 시키지 않은 것은 하지 않도록 제어하는 사례로 하였습니다.
	 */
	@Override
	public void dispaly(String s) {
		System.out.println(s +"오랜지 입니다");
		
	}
}
