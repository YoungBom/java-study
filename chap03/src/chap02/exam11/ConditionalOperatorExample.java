package chap02.exam11;

import java.util.Scanner;



public class ConditionalOperatorExample {

	public static void main(String[] args) {
		int score = 75;
		
		char grade = (score > 90) ? 'A':((score > 80)? 'B' : 'C') ;
		System.out.println(score + "점은" + grade + "등급입니다.");
		
		// QUIZ
//		0~100사이의 점수를 입력받아
//		점수가 60점 이상이면 "합격",
//		60점 미만인 경우 "불합격"을 출력하는 프로그램을 구현하시오.
//		단 음수이거나 100이 넘는 점수는 "점수입력오류"로 출력한다.
		
		Scanner sc = new Scanner(System.in);
		int sc1 = sc.nextInt();
		System.out.println("점수를 입력하세요:");
		
		 String result = (sc1 >= 100 && sc1 >= 60) ? "합격" 
				 	   : (sc1 > 0 || sc1 > 100)?  "불합격" :"점수입력오류";
		 
		 
		 System.out.println(result);
		
		
		
			
		}
		
		

	
}

