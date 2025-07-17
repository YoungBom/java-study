package chap02.exam04;

import java.util.Scanner;

public class ArithmeticOperatorExample {

	public static void main(String[] args) {
		// TODO: 나중에 추가 연습하기! 중요함!	
		// 산술연산자
		// 피연산자 타입이 동일하지 않을 경우 아래 규칙에 따라 일치시켜 연산 수행
		// 피연산자가 byte, short, char 타입일 경우 모두 int 타입으로 변환
		// 피연산자가 모두 정수 타입이고 long 타입 포함될 경우 모두 long 타입으로 변환 – 피연산자 중 실수 타입이 있을 경우 허용 범위 큰 실수 타입으로 변환
		// 애도 역시 중요!
		
		int v1 = 5;
		int v2 = 2;
		
		int result1 = v1 + v2;
		System.out.println("result1=" + result1);
		
		int result2 = v1 - v2;
		System.out.println("result2=" + result2);
		
		int result3 = v1 * v2;
		System.out.println("result3=" + result3);
		
		int result4 = v1 / v2;
		System.out.println("result4=" + result4);
		
		int result5 = v1 % v2;
		System.out.println("result5=" + result5);
		// 주로 짝수/홀수, 배수를 확인할 때 사용한다.
		// 예) 9 % 3 == 0이 나오면 3의 배수

		// 정확한 나누기 결과값을 얻으려면 애초에 double 변수로 선언하던가 아니면 타입변환을 통해 가능.
		double result6 = (double)v1 / v2;
		System.out.println("result6=" + result6);
		
		// Quiz
//		화면에서 2자리 정수를 입력받아 10의자리 미만을 버리고
//		출력하는 프로그램을 구현하시오
		
//		[입력] [출력]
//		 55 => 50
//		 60 => 60
		Scanner sc = new Scanner(System.in);
		System.out.println("2자리 정수를 입력하세요:");
		int num = sc.nextInt();
		
		// 일의 자리 버리기
		int result9 = (num / 10) * 10;
		System.out.println("출력:" + num);
		
		int result = num - (num % 10);
		System.out.println("출력:" + result);
		
		
		
	
				
		
	}

}
