package apl02.util.arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/*
 * java.util.ArrayList의 메소드인 add()는 백터의 add() 와 동일하다 
 */
public class AddDemo {
	public static void main(String[] args) {
		/*
		 * vector는 내부적으로 String 사용. 속도가 느림, 동기화 지원
		 * ArraysList는 내부적 으로 StrinfBuffer 사용. 동기화 지원하지 않음
		 */
		ArrayList<String> lists = new ArrayList<String>();
		
		//항목 추가
		lists.add("서울");
		lists.add("부산");
		lists.add("대구");
		
		/*
		 * 출력 1 : iterator() 이용
		 * 이클립스 제안중에서 java,util.iterator 선택
		 */
		Iterator<String>it1 = lists.iterator();
		/*
		 * iterator를 선언하고 나서 who를 코딩하면 3가지 이클립스 제안이 나오는데 그중에서 ..with iterator 를 선택한다
		 */
		while ( it1.hasNext()) {
			// String string = (String) it1.next();
			System.out.printf("%s",it1.next());
			/*
			 * 윗 구문중 printg 인것에 주의
			 * printf는 포맷팅한 결과를 콘솔에 출력ㅎ겠다는의미 
			 * %s는 String 값을 의미하며, 다음 구문인 
			 * it1.next()의 리턴값을 보여주는 역활을 한다
			 * 여기서 %s의 s는 String을 의미 
			 * 만약 숫자를 포맷팅한다면 %d이며 d는 decimal이라고
			 *  하며 10진수를 뜻한다
			 */
		}
		System.out.println();
		/* 
		 * 출력2 : listiterator() dldyd
		 */
		ListIterator<String>it2 = lists.listIterator();
		while ( it2.hasNext()) {
			System.out.printf("%s",it2.next());
		}
		System.out.println();
		/*
		 * 출력3 : previous() 이용
		 */
		while ( it2.hasNext()) {
			System.out.printf("%s",it2.previous());
		}
		/*전체 요소를 한번에 입력
		 * 다른 ArrayList을 한속에 옮기거나 모를때도
		 * ArrayList 를 사용한다 
		 */
		List<String> lists2 = new ArrayList<String>();
		lists2.addAll(lists);
		/*
		 * 출력4 : 확장 for문 사용 
		 * 윗쪽의 출력문 보다 훨씬 간단해진 
		 * 코드를 볼 수 있음
		 */
		for(String s : lists2) {
			System.out.printf("%s",s);
		}
		System.out.println();
		lists2.add("광주");
		lists2.add("대전");
		lists2.add("인천");
		
		/*
		 * 출력 : 5 검색해서 출력
		 */
		Iterator<String> it3 = lists2.iterator();
		String str;
		while ( it3.hasNext()) {
			str = it3.next();
			/*
			 * ArrayList 의 요소중에서 "대" 자로 
			 * 시작하는 것이 있다면 ...
			 */
			if(str.startsWith("대")) {
				System.out.printf("%s",str);
			}
		}
		System.out.println();
	}
}

