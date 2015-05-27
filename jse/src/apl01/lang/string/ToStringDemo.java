package apl01.lang.string;
/*
 * ToString()
 * String인스턴스에 저장되어 있는문자열 리턴
 */
public class ToStringDemo {
	public static void main(String[] args) {
		double d = 858.8d;
		String s = Double.toString(d);
		/*
		int dot = s.indexOf('.');
		System.out.println(dor+"digits"+"before decimal point.");
		System.out.println(s.length() - dot - 1+ "digits after decimal point" );
		*/
		int dot = s.indexOf('.');
		System.out.println("소수점 앞자리 자릿수 : "+dot);
		System.out.println("소수점 뒷자리 자짓수 : "+(s.length() - dot -1 ) );
		
	}
}
