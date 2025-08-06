package sec01.exam04.quiz;

import java.util.Objects;

import sec01.exam01_2.Student;

//Song 클래스
//1. 필드
//	- name: String
//	- singer: String
//2. 생성자
//	+ Song()
//	+ Song(name: String, singer: String)
//3. 메소드
//	중복되는 요소를 추가했을 때 저장되지 않도록 hashCode()와 equals() 재정의
//	출력 예시에 맞춰 toString() 재정의
public class Song {
	private String name;
	private String singer;

	public Song(String name, String singer) {

		this.name = name;
		this.singer = singer;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, singer);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Song)) {
			return false;
			
		}

		Song other = (Song) obj;
		return Objects.equals(name, singer) && Objects.equals(singer, name);

	}

	@Override
	public String toString() {
		return "{제목=" + name + ", 가수= " + singer + "} ";
	}

}
