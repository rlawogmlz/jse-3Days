package oop01.syntax;
/*
data : 2015-05-21
Author : 김재희
Desc : 맴버변구에 관한 문법
*/

/*
 뱀버변수에 관한 자바 튜토리얼 내용
 There are serveral kinds of variables
 
 Member Variables in a class- these are called fields.
 Variables in a method or block of code-these are called local variables.
 Variables in method declarations-these are called parameters
 */
/*
 변수의 종류
 - 클래스 변수 ( 클래스 영역, 클래스 매모리에 올라갈때 가장 먼저 생성 )
 - 인스턴스 변수 ( 클래스 영역, 인스턴스 생성시 생성 )
 - 호컬 변수 ( 지역변수, 매서드 역역, 변수 언선문 수행시 생성 )
  */
 
/*
 인스턴스 변수 (instance variable )
 - 1. 각 인스턴스의 개별적인 저장 공간
 - 2. 인스턴스 생성 후 , "참조변수.인스턴스 변수명"으로 접근
 - 3. 인스턴스 생성 할 때 생성되고 , 참조변수가 없을떄 가비지 컬렉터에 의해 자동 제거
 */
/*
 클래스 변수 ( Class variable = Static variable )
 - 같은 클래스의 모든 인스턴스들이 같은 값으로써 공유하는 변수 
 - 인스턴스 생성없이 "클래스명. 클래스 변수명"으로 접근
 - 클래스가 로딩될 때 생성되고, 프로그램이 종료될때 소멸
 */
/*
 지역변수 (Local variable)
 - 메소드 내에 선언되며, 메소드의 종료와 함께 소멸
 - 조건문, 반복문의 블록 {} 내에 선언된 지역 변수는 블록을 벗어날 떄 소멸
 - 반드시 초기화를 해줘야 함
   */
/*
 인스턴스변수, 클래스 변수, 지역변수의 차이점
 - 인스턴수 변수 : 할당된 값이 가변적
 - 클래스 변수 : 항상 고정된 값
 - 지역변수 : 매개값 또는 초기값 할당 후 사용 가능
  */
public class No08_MemberVarSystax {

	
}
