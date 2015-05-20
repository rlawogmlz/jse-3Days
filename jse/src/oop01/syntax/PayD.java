package oop01.syntax;

public class PayD {
	public static void main(String[] args) {

		String hulk = "헐크";
		int hulkSalary = 200;
		String iron= "아이언";
		int ironSalary = 300;
		String thor = "토르";
		int thorSalary = 500;

		PayC hulkPay =  new PayC();
		hulkPay.setTaxVal(hulkSalary);
		hulkPay.setIncome(hulkSalary);

		System.out.println("=== "+hulk+"의 5월 급여 내역 ===");
		System.out.println("급여 : "+hulkSalary ); // 10%
		System.out.println("세금 : "+hulkPay.getTaxVal()); //10%
		System.out.println("실수령액 : "+hulkPay.getIncome());
		System.out.println();
		
		PayC ironPay =  new PayC();
		ironPay.setTaxVal(ironSalary);
		ironPay.setIncome(ironSalary);
		
		System.out.println("=== "+iron+"의 5월 급여 내역 ===");
		System.out.println("급여 : "+ironSalary ); // 10%
		System.out.println("세금 : "+ironPay.getTaxVal()); //10%
		System.out.println("실수령액 : "+ironPay.getIncome());
		System.out.println();
		
		PayC thorPay =  new PayC();
		thorPay.setTaxVal(thorSalary);
		thorPay.setIncome(thorSalary);
		
		System.out.println("=== "+thor+"의 5월 급여 내역 ===");
		System.out.println("급여 : "+thorSalary ); // 10%
		System.out.println("세금 : "+thorPay.getTaxVal()); //10%
		System.out.println("실수령액 : "+thorPay.getIncome());
		System.out.println();

	}

}
