package com.jdev.core;

public class MemberService {

	// 서비스에서 추구해야하는 가치는 뭘까?
	// 이전의 내가 배운 내용이라면, 트랜잭션 내의 순서를 보장하는 것.
	// MVC라고 생각한다면, 대부분의 작업은 도메인에서 하고, 그 사이의 순서를 보장하는 것.

	// 멤버서비스는 무엇을 알아야할까?
	// 일단 Member 클래스에 대한 정보가 있어야겠지. -> 필요없는 듯
	// private Member member;

	//어떤 저장소를 쓸 지 알아야겠지? -> 생성자를 통해서 받아야겠다.
	private MemberRepository memberRepository;

	public MemberService (MemberRepository memberRepository) {
		this.memberRepository = memberRepository;
	}

	// DTO를 써야한다는 것을 알고있지만, 아직 학습하지않았기에, DTO 없이 해보도록 하겠다.
	// 왜 DTO가 필요한가에 대한 명확한 이해를 얻을 수 있을 것이다.
	public void signUp (Long id, String name, Grade grade) { // Long이 좋을까 long이 좋을까?
		//null 값이 있을 가능성이 있다면, null이 되는 Long을
		//null 값 비허용하고, 메모리측면에서 효율성을 위해서는 long을 사용


		Member member = new Member(id, name, grade);
		memberRepository.save(member);
	}

	public Member signIn (Long id) { //TODO : 비밀번호가 있어야하지않을까?

		Member member = memberRepository.findById(id);

		if (member != null) {

			System.out.println("로그인 성공, 회원 이름 : " + member.getName());
			return member;
		}

		return null;
	}
}

