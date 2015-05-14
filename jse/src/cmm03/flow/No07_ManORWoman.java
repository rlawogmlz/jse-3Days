package cmm03.flow;

import java.util.Scanner;

public class No07_ManORWoman 
{
	public static void main(String[] args) 
	{
		String ssn = " ";
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("주민번호를 입력하세요 :");
		ssn = scanner.nextLine();
		//string을 입력 받을 때에는 nextline();
		
		char ch = ssn.charAt(7);
		// chatAt(index) 는 배열에 자리수 검사 코드 
		if(ch == '1' || ch =='3')
		{
			System.out.println("남자");
		}
		else if(ch == '2' || ch == '4')
		{
			System.out.println("여자");
		}
		else
			System.out.println("잘못 입력하셧습니다");
		scanner.close();
		
	}
}
