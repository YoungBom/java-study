package sec.exam01.quiz;

import java.util.Scanner;

public class Quiz4 {
//	Quiz
//	반 전체 학생이 몇 명인지 입력을 받아 배열을 만들고,
//	우리반 학생들 이름을 입력받아서 모두의 이름을 배열에 추가합니다.
//	전체 학생 중에서 오늘 커피 쏠 사람을 랜덤으로 뽑으려고 해요.
//	Math.random()을 활용해서 학생 한 명을 추출하여 출력하세요.

	public static void main(String[] args) {

		System.out.print("전체 학생 수를 입력하세요: ");
		Scanner sc = new Scanner(System.in);
		String[] student = new String [count]; 
		int count = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < count; i++) {
			student[i] = sc.nextLine();
			System.out.print((i + 1) + "번째 학생 이름을 입력하세요: ");
			
			int luckyguy = (int)(Math.random() * count);
			System.err.println("오늘 커피빵주인은..." + luckyguy + "입니다.");
		}
	}
}
	