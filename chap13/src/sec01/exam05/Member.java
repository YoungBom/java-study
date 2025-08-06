package sec01.exam05;

import java.util.Objects;

import sec01.exam04.quiz.Song;

public class Member implements Comparable<Member> {
	private String name;
	private int age;

	public Member(String name, int age) {
		this.name = name;
		this.age = age;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "{이름=" + name + ", 나이= " + age + "} ";

	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Member)) {
			return false;
		
		}
		Member other = (Member) obj;
		return age == other.age && Objects.equals(name, other.name);
		
	}

	@Override
	public int compareTo(Member other) {
//		return age - other.age;
		
		if(age < other.age) return -1;
		else if (age > other.age) return 1;
		else return 0;
	}
}