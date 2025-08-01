package sec.exam01.quiz;


public class Quiz2 {
//	Quiz
//	실행 클래스의 deleteChar 메소드를 구현하시오
//	deleteChar(원본문자열, 삭제문자열) 메소드는 원본 문자열에서 삭제 문자열에 속한 문자를 제거하고 
//	남는 문자열을 리턴하는 메소드입니다.
//	※ 참고: 정적(static) 메소드 안에서 인스턴스 메소드를 쓸 수 없습니다.
//	
//	[입력]
//	1) 1,2-3 ,-!
//	2) 1a2b3 12345
//
//	[출력]
//	1) 123
//	2) ab

	public static String deleteChar(String original, String delete) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < original.length(); i++) {
			char ch = original.charAt(i);
			if (delete.indexOf(ch) == -1) {
				result.append(ch);
			}
		}
		return result.toString();
	}

	public static void main(String[] args) {
		

		System.out.println("1)"  + deleteChar("1,2-3 ,-.!", ",- .!"));
		System.out.println("2)" + deleteChar("1a2b3 12345", "12345"));
	}
}
