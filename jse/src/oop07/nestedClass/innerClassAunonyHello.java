package oop07.nestedClass;

public class innerClassAunonyHello {
	interface GreetingSevice{
		public void greet(String name);
	}
	public void sayHello() {
		/*
		  내부클래스 인터페이스 구현 방법 1
		 */
		class EnglishGreetSeviceImpl implements GreetingSevice{

			@Override
			public void greet(String name) {
				System.out.println("Hello"+name);
			} 
		}
		GreetingSevice eng = new EnglishGreetSeviceImpl();
		
		/*
		  내부 클래스 인터페이스 수현 방법 2
		 */
		GreetingSevice kor = new GreetingSevice() {
			
			@Override
			public void greet(String name) {
				System.out.println("안녕"+name);
				
			}
		};
		eng.greet("TOM");
		kor.greet("톰");
	}
	public static void main(String[] args) {
		innerClassAunonyHello greet = new innerClassAunonyHello();
		greet.sayHello();
		
	}
}

