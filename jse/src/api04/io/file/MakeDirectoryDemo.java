package api04.io.file;

import java.io.File;

public class MakeDirectoryDemo {
	public static void main(String[] args) {
		File file = null;
		boolean isDirectory = false;
		
		try{
			//원하는 경로를 파라미터로 입력함
			file = new File("C:"+File.separator+"Test2");
			/*
			 * /가 디렉토리 경로를 분할 할떄 사용 되는데,
			 	윈도우에서는 \\ 사용하고 
			 	unix에서는 / 사용하기도 해서
			 	환경에 따라 프로그램에 에러를 발생시키는 사례가 번번하여 
			 	앞으로는 FIle.separator 하면 환경에 따라 
			 	동적으로 구분자를 주므로 관련 에러가 발생하지 않는다.
			 */
			
			if(!file.isDirectory()){
				isDirectory = file.mkdir();
				
				System.out.println((isDirectory)?"폴더생성성공 " : "폴더생성실패");
			}else{
				System.out.println("이미 존재합니다.");
			}
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("MakedirectoryDemo에서 에러 발생 !!");
		}
	}

}
