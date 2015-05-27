package oop07.nestedClass;

public class innerClassLocal {
	int a = 100;
	public void innerTest( int K ){
		int b = 200;
		final int c = 'k';
		
		class inner{
		
			public void getData(){
				System.out.println("맴버변수 a : "+a);
				System.out.println("상수 c : "+c);
			}
		
		}
		
		inner inn = new inner();
		inn.getData();
	}	
}
