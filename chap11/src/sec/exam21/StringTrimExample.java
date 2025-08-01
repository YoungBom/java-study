package sec.exam21;

public class StringTrimExample {
//문자열 앞뒤를 잘라내는 trim 메소드에 대한 설명
	public static void main(String[] args) {
		String tel1 = " 02";
		String tel2 = "123  ";
		String tel3 = "   1234    ";
		
		String tel = tel1.trim() + "-" + tel2.trim() + "-" + tel3.trim();
		System.out.println(tel);

	}

}
