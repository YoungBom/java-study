package chap02.exam07;

import java.util.Scanner;

public class CompareOperatorExample1 {

	public static void main(String[] args) {
		// 비교연산자
		// 피연산자의 대소 비교하여 true/false 산출: 조건문이나 반복문에서 실행 흐름 제어
		// 동등 비교 연산자는 모든 타입에 사용 가능
		// 크기 비교 연산자는 boolean 외 모든 기본 타입에 사용 가능
		
		
		int num1 = 10;
		int num2 = 10;
		boolean result1 = (num1 == num2);
		boolean result2 = (num1 != num2);
		boolean result3 = (num1 <= num2);
		System.out.println("result1=" + result1);
		System.out.println("result2=" + result2);
		System.out.println("result3=" + result3);
		
		
		// 문자의 대소비교
		char char1 = 'A';
		char char2 = 'B';
		boolean result4 = char1 < char2; // 유니코드 65와 66을 비교해서 본 것이라. 결과값은 true가 나옴.
		System.out.println("result4=" + result4);
		
		// Quiz
		//두개의 숫자를 입력받아
		//앞의 수가 크거나 같은 경우 true를
		//뒤의 수가 큰 경우는 false를 출력하는 프로그램을 구현하시오.
		
		// [입력] [출력]
		// 1 2 => false
		// 10 5 => true
		Scanner sc = new Scanner(System.in);
		System.out.print("두 개의 정수를 입력하세요:");
		
		int num3 = sc.nextInt();
		int num4 = sc.nextInt();
		
		boolean result = num3 >= num4;
		System.out.println(result);
		
		
	
	
		
		
	
	}

}
