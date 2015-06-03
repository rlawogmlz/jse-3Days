package apl02.util.hashMap;

import java.lang.reflect.Member;
import java.util.HashMap;
import java.util.Map;


/*
 * 객체지향의 4대 틍징인 은닉화, 상속 추상화, 다양성 중
 * 추상화 + 다양성을 구현하는 implements 입니다.
 * 인터펭스 구현 방식은 클래스 명 다음에 implements 키워드 코딩후
 * 인터페이스를 입력하시고 나면, 클래스명에 빨간줄에(에러)표시가 뜨는데 
 * 마우스를 대시면 add unimplement 를 클릭하세요 
 * 그럼 자동 오버라이딩이 됩니다. 
 */
public class MemberServiceImpl implements MemberService{

	Map<String, Object> map new HashMap<String, Object>();
	@Override
	public void join(String id, String password, String name, int age,
			String addr) {
		// 1.  vo 객체를 생성해서
		// setter로 값을 불러온다 
		// DB에 값이 저장되는 형상을 표현한 것이다.
		MemberVo Vo = new MemberVo();
		Vo.setAddr(addr);
		Vo.setAge(age);
		Vo.setId(id);
		Vo.setName(name);
		Vo.setPassword(password);
		/*
		 * 2. 인스턴스 변수값을 통합하여 운반하고 검색할 
		 * 컬렉션을 준비한다.
		 */
		// Map<String, Object> map new HashMap<String, Object>();
		
		/*
		 * Vo.getId()); 가 가능한 이유는 위 메소드인 Vo.setId() 에서 
		 * 저장한 인스턴스 변수 String id를 같이 공유하며
		 * 바라보고 있기 때문이다
		 * vo.gerId() 를 "id"라는 리터럴
		 */
		map.put("ID", Vo.getId());
		map.put("비밀번호", Vo.getPassword());
		/*1. 첫뺀째 에러 유형
		 * map.put(vo.getID(),vo.getpassword
		 * 이건 개발자가 많이 하는 착각의 코딩
		 */
		map.put("나이", Vo.getAge());
		map.put("이름", Vo.getName());
		/*
		 * 2번째 에러 유형
		 * map.put("age",vo.getAge()); 
		 * valueOf() 는 api.lang.sting. ValueOdDemo 참조
		 */
		map.put("주소", Vo.getAddr());
	}

	@Override
	public void login(String id, String password) {
		/*
		 * join()에 지역변수로 map를 선언했던;
		 * join(); 만 그값을 참조 할수 있고, login()는 
		 * 그 ㄱ밧을 볼 수 없어서 아래 map.get("id");에서 
		 * 사용할 수 없엇다 
		 * 그대러, 이 클래스의 메소드라는 그 값을 바라볼수 있도록 필드에 선언 해준다,.
		 */
		System.out.println("맵에 담긴 ID : "+map.get("id"));
		if(!map.containsKey("id")) {
			System.out.println("입력하신 ID는 존재하지 않습니다" +"\n"+"다시 입력하세요 \n");
		}else {
			if(!(map.get("password").equals(password))){
				System.out.println("비번이 다릅니다\n 다시 입력하세요 ");
			}else{
				
				System.out.println("환영합니다"
											+vo.getAddr()+"에 사시는"
											+vo.getAge()+"세 되시는"
											+vo.getName()+"님 환영합니다");
			}
		}
		
	}
	/*
	 * 3번쨰 에러유형 NullPointException 
	 * map. get(KEY) 에서 key 는 맵을 선언한 타입과 일치헤야 히는데.. 현재 필드에 선언된 맵은
	 * <String, Objaect> 이므로 
	 * password는 String 값이  
	 */
	
	
}
