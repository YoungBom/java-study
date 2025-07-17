package chap02.exam03;

public class DenyLogicOperatorExample {

	public static void main(String[] args) {
		// 논리 부정 연산자
		// 조건문과 제어문에서 조건식 값 부정하여 실행 흐름 제어
		// 토글 (toggle) 기능
		// boolean 타입에만 사용 가능
		// 앞에 !를 붙이면 not 기능 true였던 것을 false로 바꾼다. ! == not
		boolean play = true;
		System.out.println(play);
		
		play = !play;
		System.out.println(play);
		
		play = !play;
		System.out.println(play);
		
		
		
	}

}
