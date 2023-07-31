package com.jdev.core;

public class Member {

	private Long id;
	private String name;
	private Grade grade;

	// 인텔리제이 생성 기능 이용해서 생성자와 getter setter 생성
	// lombok을 사용하면 나중에 어노테이션으로 지정해줄 수 있음
	// 참고로 setter에 대해서는 없는 것이 좋다는 의견이 있음 -> 진짜 수정이 필요한 필드에 대해서만 setter 만들어주기
	// 왜냐하면 구조가 복잡해졌을 때 setter의 잘못된 사정으로 오류가 발생하였을 경우 찾기 복잡하기 때문

	public Member (Long id, String name, Grade grade) {
		this.id = id;
		this.name = name;
		this.grade = grade;
	}

	public Long getId () {
		return id;
	}

	public void setId (Long id) {
		this.id = id;
	}

	public String getName () {
		return name;
	}

	public void setName (String name) {
		this.name = name;
	}

	public Grade getGrade () {
		return grade;
	}

	public void setGrade (Grade grade) {
		this.grade = grade;
	}
}
