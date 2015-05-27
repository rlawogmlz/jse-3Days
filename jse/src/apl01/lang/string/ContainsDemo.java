package apl01.lang.string;
/*
 * java.lang.String에 있는 메소드
 * contain("a") : 문자영중에 a가 있는지 체크
 */
public class ContainsDemo {
	public static void main(String[] args) {
		String str = "a,b,c,d,e";
		System.out.println(str.contains("f") ? "f가 있음" : "f가 없음");
	}

}
