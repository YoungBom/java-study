package sec.exam19;

public class StringSubstringExample {
// 문자열을 잘라내는 substring 메소드에 대한 설명
	
	public static void main(String[] args) {
		String ssn = "880815-1234567";
		
		String firstNum = ssn.substring(0,6);
		System.out.println(firstNum);
		
		String secondNum = ssn.substring(7);
		System.out.println(secondNum);
		

	}

}
