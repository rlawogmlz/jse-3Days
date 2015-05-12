 package cmm01.var;
/*
 * Date : 2015.5.11
 * Author : ������
 * Description :  ĳ���� ���� ���� �н��ڷ�
 */
 class No02_CastingDemo
{
	 public static void main(String[] args)
	 {
		/*
		 * UP-Casting
		 * ��ȯ ( Conversion )
		 * Promotion
		 * ������ ( Implict )�ڵ���ȯ
		 * �ڵ��� ��ȯ�� ������ Ÿ���� ǥ�� ������ ���� �ʿ���
		 * ���� ������ ��ȯ�� �ɶ��� �����ϴ�.
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
		 Down-Casting
		  *  ĳ���� ( Casting )
		  *  ������ȯ
		  *  ���α׷����� �����( explict )���� �����ϴ�Ÿ�� ��ȯ
		  *  ��ȣ��ȯ�� �Ǵ� ��쿡�� �ݵ�� ��������� ĳ���� �Ͽ��� �Ѵ�.
		  *  ��, ������ �ս��� �߻��� �� �ִ� 
		 */
		 	 
		 	 
		 	 Double varDou = 123.456;
		 	 int varint2 = 3;
		 	 // int downByte = (int) varDou;
		 	 byte varB2 = (byte) varint2;
		 	 float varF = 123.456f;
		 	 int varint3 = (int) varF;
		 
		 
		 System.out.println("hello java");

		 System.out.println("Vaeint3�� �� : varint"+ varint3);
	 }


	 
	 
	 
	 
	 
	 
 
} 