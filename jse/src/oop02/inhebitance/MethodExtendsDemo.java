package oop02.inhebitance;
/*
Date : 2015-05-22
author : 
Desc : 메소드 상속에 관한 예제
*/

/*
 Car
 △
  | 
  Hcar <- new (instaniate ) : 인스턴스 생성 개념도
 */

class car2{
	String name = "자동차";
	public String gear(){
		return "수동 기어";
	}
}

class Hcar2 extends car2{
	String brand = "현대";
	public String autogear(){
		return "오토 기어";
	}
}
public class MethodExtendsDemo {
	public static void main(String[] args) {
		Hcar2 h = new Hcar2();
		System.out.println(h.gear());
		System.out.println(h.autogear());
		
		car2 c = new car2();
		System.out.println(c.gear());
		//상속시 부모는 자식의 메소드를 호출할 수 없다.
		// 오직, 자식만 부모의 메소드를 호출할 수 있다.
	}
}
