package com.jdev.core;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MemberRepositoryImpl implements MemberRepository {

	private Map<Long,Member> memoryDB = new HashMap<>();
	// 구현체이므로 바로 new로 연산해도 되지 않을까 싶다.

	@Override
	public void save (Member member) {

		memoryDB.put(member.getId(),member);

	}

	@Override
	public Member findById (Long memberId) {

		return memoryDB.get(memberId);
	}

	@Override
	public List<Long> getMemberList () {
		return memoryDB.keySet().stream().toList();
	}
}
