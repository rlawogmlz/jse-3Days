 package cmm01.var;
/*
 * Date : 2015.5.11
 * Author : 김재희
 * Description :  캐스팅 문법에 대한 학습자료
 */
 class CastingDemo
{
	 public static void main(String[] args)
	 {
		/*
		 * UP-Casting
		 * 변환 ( Conversion )
		 * Promotion
		 * 묵시적 ( Implict )자동변환
		 * 자동형 변환은 데이터 타입의 표현 범위가 작은 쪽에서
		 * 많은 쪽으로 변환이 될때만 가능하다.
		 * ex) double -> float 
		 * bute -> short -> int ->long -> folat -> double ->char -> int 
		 */
		 
		 /*
		 byte varByte = 1;
		 int barint =123;
		 double varDouble = 123.456;
		 
		 int upByte = varByte;
		 double upByte2 = varByte;
		 double upInt = varint;
		 */
		 
		 /* 
		 Dwon-Casting
		  *  캐스팅 ( Casting )
		  *  강제형변환
		  *  프로그램에서 명시적( explict )으로 지정하는타입 변환
		  *  축호변환이 되는 경우에는 반드시 명시적으로 캐스팅 하여야 한다.
		  *  단, 데이터 손실이 발생할 수 있다 
		 */
		 	 
		 	 
		 	 Double varDou = 123.456;
		 	 int varint2 = 3;
		 	 // int downByte = (int) varDou;
		 	 byte varB2 = (byte) varint2;
		 	 float varF = 123.456f;
		 	 int varint3 = (int) varF;
		 
		 
		 System.out.println("hello java");

		 System.out.println("Vaeint3의 값 : varint"+ varint3);
	 }


	 
	 
	 
	 
	 
	 
 
} 