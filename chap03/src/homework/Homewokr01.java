package homework;

import java.util.Scanner;

public class Homewokr01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("말해보세요:");
		String input = sc.nextLine();
		
		// 상항(조건) 연산자 이용
		// 변수 쪽에 equals()를 호출하면, input이 null일 경우 예외(NPE)가 발생할 수 있음
		String output = "간다".equals(input) ? "온다" : "간다";
		// 리터럴이나 상수를 앞에 두면, input이 null이어도 안전하게 비교 가능(null-safe)
		// 리터럴 = 값 자체를 넣은것 위에 "간다"같은 내가 넣은 값이다.
		
		System.out.println("앵무새:" + output);

		
		
	}

}
