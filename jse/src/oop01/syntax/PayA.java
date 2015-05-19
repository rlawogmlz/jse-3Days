package oop01.syntax;
// private 코드를 비공개하는 커멘드
// public static final 절대 바꾸지 말아라 고정된 값 누구나 공개
public class PayA {
	private String name;			
	private int salary;				// 급여
	public static final double TAX = 0.1;	//세율 0.1
	private int taxVal;
	private int income; 			//실급여 = 급여 *세율
	
	
	public void setTaxVal(int salary) {
		this.taxVal = (int) (salary*TAX);
	}
	public void setIncome(int salary){
		this.income = (int) (salary-salary*TAX);
	}
	public int getTaxVal(){
		return (int) taxVal;
	}
	public int getIncome(){
		return (int) income;
		
	}
}
/*
get
- 필드에 있는 문을 읽어 온다 

set
- 필드에서 값을 지정하겟다
*/