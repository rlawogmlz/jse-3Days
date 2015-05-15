package cmm04.array;

public class No04_AdcForLoopDemo 
{
	public static void main(String[] args) 
	{
		int[] intarr = {1,2,3,4,5};
		
		System.out.println("향상된 For문으로 출력한 예제");
		
		for(int i : intarr)		//intarr.length와 i++을 축약한 for문		
		{						//i = 0을 하지 못하므로 시작점은 무조건 배열에 첫번째
			System.out.println("\t"+i);
		}
	}
}
