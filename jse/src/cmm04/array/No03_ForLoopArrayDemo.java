package cmm04.array;

public class No03_ForLoopArrayDemo 
{
	public static void main(String[] args) 
	{
		int[] arr = {1,2,3,4,5};
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++)	//5를 제외하려면 length-1하면 마지막 배열이 제외된다
		{
			sum+= arr[i];
			
		}
		System.out.println("배열원소의 합은 " + sum);
	}
}
