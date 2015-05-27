package apl01.lang.string;
/* 
 * endwith("s")  : s로 끝나는지체크 
 */
public class EndWithDemo {
	public static void main(String[] args) {
		System.out.println("hello.txt".endsWith("txt" != null ?	"txt파일입니다 : " : "txt파일이 이닙니다"));
	}
}
