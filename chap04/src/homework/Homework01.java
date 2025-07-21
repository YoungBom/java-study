package homework;

import java.util.Scanner;

public class Homework01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("=== 놀이동상 입장료 계산하기 ===");
		System.out.println("나이를 입력해주세요:");
		int age = sc.nextInt();
		
;		
		if(age >= 19 && age <= 64) {
			System.out.println("30000원 입니다.");
		
		}else if(age >= 13 && age <= 18) {
			System.out.println("20000원 입니다.");
			
		}else if(age >= 3 && age <= 12) {
			System.out.println("10000원 입니다.");
			
		}else {
			System.out.println("무료 입니다.");
			
		}
	}
}
