package oop01.syntax;

public class CardVO {
	String kind;
	int number;
	static int width = 150;
	static int height = 300;
	
	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	
	public CardVO(String kind, int number) {
		this.kind = kind;
		this.number = number;
	}
	

}




/*
CardVO myCard = new CardVO();
myCard.kind = "heart";
myCard.number = 3;
*/

// System.out.println("나의 카드의 숫자는 "+number+"이고 무늬는 "+kind);