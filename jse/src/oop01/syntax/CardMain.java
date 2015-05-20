package oop01.syntax;

public class CardMain {
	public static void main(String[] args) {
		System.out.println("카드의 높이 : "+ CardVO.height);
		System.out.println("카드의 넓이 : "+ CardVO.width);
		
		CardVO myCard = new CardVO("heart", 3);
		CardVO YourCard = new CardVO("heart", 7);
		
		/* yourCard 인스턴스를 생성하시고 
		 * 무늬는 heart이고 숫자는 7이 나왓다고 가정할떄 
		 * 게임룰은 높은 숫자카드가 승리하는 게임
		 */
		System.out.println("당신의 카드의 "+"숫자는 "+YourCard.getNumber()+"이고 "
									+ " 내카드 "+"숫자는 "+myCard.getNumber()
									+" 이므로 당신이 이겼습니다");
	}

}
