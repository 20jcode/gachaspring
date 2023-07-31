package com.jdev.core;

import java.util.List;

public interface MemberRepository {

	// 저장소인터페이스의 목적은 무엇일까
	// member에 대한 저장과 조회
	// 기본적인 CRUD 기능이 필요하다.

	// save하나로 create와 update를 전부 담당하는 것이 맞을까?
	// MemberRepository의 사용자의 입장(어쩌면 나)에서는 기존의 유저가 있는 지 없는 지 구별해야할까?
	// 해당 관점에서는 필요없다고 생각함.
	// save는 주로 사용자의 신규 회원가입을 제공하거나, 회원 수정 기능을 제공할때
	// 중복에 대한 확인은 MemberRepository의 구현체가 알아서 책임져야함.
	// 따라서 MemberRepository의 client입장에서는 구분할 필요가 없다.
	void save(Member member);

	// 기존의 memberid에 대한 정보는 어떻게 얻는 것인지?
	Member findById(Long memberId);

	// 저장된 멤버들에 대한 정보를 얻어야한다.

	List<Long> getMemberList();

	// 근데 이런식으로 쓰면 매개변수화된 클래스의 원시사용이라는 경고가 발생
	// 매개변수화된 클래스 'List<>'의 원시 사용
	// 검사 정보: 타입 매개변수가 생략된 제네릭 클래스를 보고합니다. 그러한 제네릭 원시 타입의 사용은 Java에서 유효하지만 타입 매개변수의 목적을 무효화하며 버그를 가릴 수 있습니다. 이 검사는 javac의 rawtypes 경고와 같이 동작합니다.
	//예:
	////경고: 매개변수화된 클래스 'List'의 원시 사용
	//List list = new ArrayList<String>();
	////문자열 목록이 생성되었지만, 정수도 허용됩니다.
	//list.add(1);
	////배열 생성 중에 타입 인수를 제공하는 것이 불가능하므로 경고 없음
	//IntFunction<List<?>[]> fun = List[]::new;

	//알고보니 인텔리제이 오류가 있었는 듯 -> 업데이트하니 괜찮아졌다.;;


}
