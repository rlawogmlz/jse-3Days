package cmm04.array;

public class No05_MultiDimArrayDemo 
{
	public static void main(String[] args) 
	{		
		String[][] names = {
				{"Mr.","Ms.","Mrs"},
				{"Smith","johns","Alex"}};
		
		System.out.println(names[0][0]+names[1][0]);
		System.out.println(names[0][1]+names[1][2]);
		// 이중배열의 처음[]은 이중배열에 첫뻔째줄 ex) {"Mr.","Ms.","Mrs"},
		// 두번째 []은 두번쨰 줄 ex) {"Smith","johns","Alex"}
	}
}
