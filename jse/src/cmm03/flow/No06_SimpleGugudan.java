package cmm03.flow;

import java.util.Scanner;

public class No06_SimpleGugudan 
{
	public static void main(String[] args) 
	{
		int dan = 1;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("단 입력 : ");
		dan = scanner.nextInt();
		
		for(int i = 1; i < 10; i++)
		{
			System.out.println(dan+" * "+i+" = "+i*dan);
		}
		scanner.close();
	}
}
