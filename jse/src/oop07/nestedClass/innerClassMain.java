package oop07.nestedClass;

public class innerClassMain {
	public static void main(String[] args) {
		innerClassMain inn = new innerClassMain();
		inn.getinnerclassStatic();
	}
	
	/*
	 내부 클래스 형태중... 첫번째인 인스턴스 내부 클래스 호출 방법
	 */
	public void getinnerClassinstans(){
		innerClassinstans.inner inner = new innerClassinstans().new inner();
		inner.printdata();
	}
	public void getinnerclassStatic(){
		innerclassStatic. inner inner = new innerclassStatic.inner();
	}

	public void gerinnerClassLocal(){
		innerClassLocal outer = new innerClassLocal();
		outer.innerTest(1000);
	}
}
