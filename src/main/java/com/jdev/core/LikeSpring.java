package com.jdev.core;

public class LikeSpring {
	//스프링 컨테이너를 흉내낸 무엇인가?

	public MemberService getMemberService () {
		return memberService;
	}

	private MemberRepository memberRepository;
	private MemberService memberService;

	private static LikeSpring likeSpring;

	private LikeSpring(){} // 기본생성자로의 접근을 막고

	private LikeSpring(MemberRepository memberRepository){
		this.memberRepository = memberRepository;
		this.memberService = new MemberService(memberRepository);

	}
	public static LikeSpring createContainer(MemberRepository memberRepository){

		 likeSpring = new LikeSpring(memberRepository);
		 return likeSpring;
	}
	// 동시성 문제가 있는 스프링 컨테이너?



}
