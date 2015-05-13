package cmm03.flow;

import java.util.Scanner;

public class No02_IfElse02Demo 
{
	public static void main(String[] args) 
	{
		int kor = 0, eng = 0, math = 0, sum = 1;
		double avg = 0.0;
		String msg = "message";
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("국어 : ");
		kor = scanner.nextInt();
		System.out.print("영어 : ");
		eng = scanner.nextInt();
		System.out.print("수학 : ");
		math = scanner.nextInt();
		
		
		sum = kor + eng +math;
		avg = sum/3;
		/*avg = Math.floor(sum/3);
			소수점 버림
		*/
		
		
		
		if(sum == 100 )
		{
			msg = "보너스";
			// msg = ""; int i = 1 이렇게 1을 초기화 하듯이 msg도 출력하고 싶은 문자열으로 초기화 가능 
		}
		else if(avg >= 70)
		{
			msg = "시헙 합격";
		}
		else 
		{
			msg = "재 시헙";
		}
		
		/*System.out.println("국어 = "+kor);
		System.out.println("영어 = "+eng);
		System.out.println("수학 = "+math);*/
		System.out.println("평균 = "+(int)avg);
		//(int)avg 로 소수점 값을 정수형값으로 강제 형변환후 출력
		System.out.println("시험결과는  "+msg+"입니다");
	}
}
