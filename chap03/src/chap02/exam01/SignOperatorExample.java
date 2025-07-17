package chap02.exam01;

public class SignOperatorExample {

	public static void main(String[] args) {
		int x = -100;								//TODO 7/17 부호 연산자 실습시작점.
		int result1 = +x;							 
		int result2 = -x;
		System.out.println("result1=" + result1);
		System.out.println("result2=" + result2);
		
		byte b = 100;
//		byte result3 = -b // int 이하 정수의 연산은 int로 연산 해야되기 때문에 int로 저장한다.
		int result3 = -b; 
		System.out.println("result3=" + result3);

		
	}

}
