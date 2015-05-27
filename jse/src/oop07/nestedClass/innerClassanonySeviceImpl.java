package oop07.nestedClass;

public class innerClassanonySeviceImpl {
	
	String data = "Hello Anonymous Wolrd !!";
	
	public void print() {
	
		//new innerClassanonySevice() {
		new innerClassanonysevice() {
			
			public void printData() {
				System.out.println("익명 내부 클래스 출력 :"+data);
			}
		};
	}
}
