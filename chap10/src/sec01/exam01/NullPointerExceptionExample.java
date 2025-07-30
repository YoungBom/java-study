package sec01.exam01;

public class NullPointerExceptionExample {

	public static void main(String[] args) {
		// 실행 예외 클래스
		// NullPointerException 실행예외 케이스
		// 가장 흔하게 발생하는 실행 예외 클래스이다.
		
		
		String data = null; // null로 초기화 시 참조하는 객체가 없음 
		System.out.println(data.toString()); // 객체에 접근 -> 접근할 객체가 없음
		// NPE 발생시 .을 찾아서 참조 변수가 객체를 참조하고 있는지 확인
		// 실행 예외의 경우 컴파일은 가능하다.(실행 중 발생)
		// 일반 예외의 경우는 컴파일러가 에러를 띄워준다.
	}

}
