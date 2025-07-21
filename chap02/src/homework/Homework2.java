package homework;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
//		float we = 13.5f;
//		float are = 41.7f;
		
//		System.out.println(we);
//		System.out.println(are);
//		System.out.println(we * are);
//		System.out.println((we + are) * 2);  내가 풀었던 방식은 단순히 변수선언해서 그 값에 대한 식을 썼다.(단순 출력으로만 했음)

		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로:");
		double width = sc.nextDouble();
		
		System.out.print("세로: ");
		double height = sc.nextDouble();
		
		System.out.println("면적: " + width * height);
		System.out.println("둘레: " + (width + height) * 2);		
	}
		
	}


