package api01.lang.object;

public class EqualsDemo2 {
	public static void main(String[] args) {
		Person p1 = new Person("800101=1555555");
		Person p2 = new Person("800101=1555555");
		String result = "";
		
		System.out.println(" 주소값으로 비교");
		result = (p1 == p2) ? "p1과 p2는 같은사람" : "p1과 p2는 다른사람";
		System.out.println("(p1 == p2) : "+result+"\n");
		/*
		 (p1 == p2) 결과값 : p1과 p2는 다른사람
		 결과로 보아 == 는 해시코드 주소값을 비교한다
		 */
		
		System.out.println("할당한 값으로 비교");
		result = (p1.equals(p2)) ? "p1과 p2는 같은사람" : "p1과 p2는 다른사람";
		System.out.println("(p1.equals(p2)) : "+result);
		/*
		 (p1.equals(p2))결과값 :  ? "p1과 p2는 같은사람"
		 결과로 보아 equals() 는 실제 리터럴 값을 비교한다.
		 */
	}
}
class Person{
	private String ssn;
	public Person(String ssn){
		this.ssn = ssn;
	}
	// getter setter 
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	// equlas overriding 단축기
	// art + shift + s 
	// generate hashcode() and equlas을 클릭
	
	@Override
	public boolean equals(Object obj) {
		if( obj != null && obj instanceof Person) {
			return ssn == ((Person)obj).ssn;
		}
		return false;
	}
}
	