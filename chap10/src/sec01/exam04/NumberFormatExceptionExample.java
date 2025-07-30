package sec01.exam04;

public class NumberFormatExceptionExample {

	public static void main(String[] args) {
		String data1 = "100";
//		String data2 = "a100"; // 숫자로 변환할수 없을때 뜨는 예외다.
		String data2 = "200";
		
		int value1 = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data2);
		
		int result = value1 + value2;
		System.out.println(data1 + "+" + data2 + "=" + result);

	}

}
