package com.jdev.core;

public class Member {

	private Long id;
	private String name;
	private Grade grade;

	// 인텔리제이 생성 기능 이용해서 생성자와 getter setter 생성
	// lombok을 사용하면 나중에 어노테이션으로 지정해줄 수 있음

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
