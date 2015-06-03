package api04.io.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

public class FileInfoDemo {
	
	public static void main(String[] args) {
		System.out.println("파일 이름을 넣으세요");
		String name = "";	
		// File API를 사용하고자 할때 무조건 try catch 쓴다
		try{
				BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
				name = in.readLine();
		}catch(Exception ex){
			ex.printStackTrace();
			System.out.println("FileInfodemo 에서 에러남!!");
		}
		File file = new File(name);
		if(file.exists()){
			System.out.println("파일이름 : "+ file.getName());
			System.out.println("파일 경로 : "+file.getPath());
			System.out.println("쓰기가능여부 : "+file.canWrite() );
			System.out.println("읽기 가능여뷰 : "+file.canRead());
			System.out.println("파일 길이 : "+file.length()+ "byte");
		}else{
			System.out.println("해당파일은 존재하지 않음");
		}
	}
	
}

