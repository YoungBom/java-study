package chap02.exam10;

import java.util.Scanner;

public class AssignmentOpertorExample {

	public static void main(String[] args) {
		// 대입연산자 == (+=,-=,*=,/=)
		// 오른쪽 피연산자의 값을 왼쪽 피연산자인 변수에 저장
		
		int result = 0;
		
		result += 10; // result = result +10;
		System.out.println("result=" + result);
		
		result -= 5; // result = result -5;
		System.out.println("result=" + result);
		
		result *= 3; // result = result *3;
		System.out.println("result=" + result);
		
		result /= 5; // result = result / 5;
		System.out.println("result=" + result);
		
		result %= 3; // result = result / %3;
		System.out.println("result=" + result);
		
		// Quiz
//		금액을 입력받아 500원, 100원, 50원, 10원, 1원 동전으로 변경하려고 합니다.
//		최소 필요한 동전의 개수를 출력하는 프로그램을 구현하시오.
		
//		[입력]
//		5640
		
//		[출력]
//		500원: 11개	
//		100원: 1개
//		50원: 0개
//		10원: 4개
//		1원: 0개
		
		Scanner sc = new Scanner(System.in);
		System.out.println("금액을 입력하시오:");
		int  money = sc.nextInt();
		
		int coin500 = money / 500;
		money %= 500;
		
		int coin100 = money / 100;
		money %= 100;
		
		int coin50 = money / 100;
		money %= 50;
		
		int coin10 = money / 100;
		money %= 10;
		
		int coin1 = money / 100; // 남은 금액은 전부 1원
		money %= 1;
		
		 
		System.out.println("500원" + coin500 + "개"); 
		System.out.println("100원" + coin100 + "개"); 
		System.out.println("50원" + coin50 + "개"); 
		System.out.println("10원" + coin10 + "개");
		System.out.println("1원" + coin1 + "개");
		

	}

}
