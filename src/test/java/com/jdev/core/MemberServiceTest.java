package com.jdev.core;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MemberServiceTest {

	//이게 이제 나의 스프링 컨테이너
	LikeSpring likeSpring = LikeSpring.createContainer(new MemberRepositoryImpl());

	@Test
	void 회원가입회원조회 () {

		//given
		long id = 0;
		String name = "tuna";

		//when
		likeSpring.getMemberService().signUp(id,name,Grade.BASIC);

		//then
		Member m = likeSpring.getMemberService().signIn(id);

		assertEquals(id,m.getId());
	}

}