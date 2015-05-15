package cmm04.array;

public class No02_StringArrayDemo {
	public static void main(String[] args) {
		
		//String[] juso = new String[3];
		String[] juso = { "서울", "종로", "광화문" };
		
		/*
		juso[0] = "서울";
		juso[1] = "종로";
		juso[2] = "광화문";
		*/
		for(int i = 0; i < juso.length; i++) 	//i < index말고 juso.length로 하면 배열에 수를 알아서 갯수를 세어준다
		{
			System.out.print(juso[i]+" ");
	
		}
	}
}
