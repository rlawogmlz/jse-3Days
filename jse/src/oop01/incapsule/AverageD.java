package oop01.incapsule;

public class AverageD {
	public static void main(String[] args) {
		// 학생 객체생성 및 메모리 할당
		AverageC hulk= new AverageC();
		AverageC iron = new AverageC();
		AverageC hawk = new AverageC();
		
		/* 이름 저장*/
		
		/* 정수 저장*/
		hulk.kor = 100;
		hulk.eng = 80;
		iron.kor = 50;
		iron.eng = 90;
		hawk.kor = 20;
		hawk.eng = 40;
		
		/*총점과 평권을 계산*/
		
		hulk.total = hulk.kor + hulk.eng;
		hulk.avg = hulk.total/2;

		iron.total =iron.kor + iron.eng;
		iron.avg = iron.total/2;

		hawk.total = hawk.kor + hawk.eng;
		hawk.avg = hawk.total/2;
		
		/* 출력 */
		System.out.println("==="+iron.name+"의 성적표===");
		System.out.println("국어 :"+iron.kor);
		System.out.println("영어 :"+iron.eng);
		System.out.println("총점 :"+iron.total);
		System.out.println("평균 :"+iron.avg);
		System.out.println();

		System.out.println("==="+hulk.name+"의 성적표===");
		System.out.println("국어 :"+hulk.kor);
		System.out.println("영어 :"+hulk.eng);
		System.out.println("총점 :"+hulk.total);
		System.out.println("평균 :"+hulk.avg);
		System.out.println();
		
		System.out.println("==="+hawk.name+"의 성적표===");
		System.out.println("국어 :"+hawk.kor);
		System.out.println("영어 :"+hawk.eng);
		System.out.println("총점 :"+hawk.total);
		System.out.println("평균 :"+hawk.avg);
		System.out.println();
	}
}
