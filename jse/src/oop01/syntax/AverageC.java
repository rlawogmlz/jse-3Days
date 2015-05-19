package oop01.syntax;

public class AverageC {
	String name;
	int kor;
	int eng;
	int total;
	double avg;
	
	public void setName(String namename) {		//이름을 저장하는 기능
		// setName(string name)이랑 AverageB에 있는 String name이랑은 다른 변수다
		this.name = namename;
	}
	/*국어 점수 저장하는 기능*/
	public void setKor(int kor){
		this.kor = kor;
	}
	/*영어점수 구하는 기능*/
	public void setEng(int eng){
		this.eng = eng;
	}
	/*총점을 구하는 기능*/
	public void setTotal(int kor, int eng ){
		this.total = kor + eng;
	}
/*	평균을 구하는 기능*/
	public void setAvg(int total ){
		this.avg = total/2;
	}
	/* 평균을 구하는 기능 2 / 국어 영어점수로만 구하기 */
	public void setAvg(int kor, int eng){
		this.avg =( kor + eng) / 2;
	}
}
