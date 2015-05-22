package oop02.inhebitance;
/*
Method Over Riding
- 상속관계에서 Super에 선언된 메소드를Sub에서 다시 선언한 경우
- 이런 경우 Super에 메소드는 무시된다.
- 같은 메도스가 Super와 Sub에게 모두 선언 되었으나, 내용은 다를수 있다
*/

/*
 오버라이딩의 목적
 - 클래스의 다형성을 구현할 수 있다.
 - 단, Super와 Sub 사이의 메소드명, 파라미터갯수, 파마미터 데이터 타입이 같아야 한다
 - Super가 가진 메소드를 상속해 주나 같은 이름의 메소드가 Sub에 존재한다면
 	Sub에 있는 메소드를 우선 사용해야 함
 - Super의 메소드 기능을 유지하면서, 상황에 따라 Sub의 변형된 기능을 
 	사용하고 싶을떄 사용하며 다형성의 핵심 원리이다. 
 - Super의 메소드를 캡슐화 한다고 볼 수 있다.
 */

class Parents{
	void show(){
		System.out.println("parents의 show() 를 수행..");
	}
}

class child extends Parents{
	void show(){
		System.out.println("child의 show() 를 수행..");
	}
}

public class No02_OverRidingDemo {
	public static void main(String[] args) {
		Parents p = new Parents();
		p.show();
		
		child c = new child();
		c.show();
		
		
	}

}
