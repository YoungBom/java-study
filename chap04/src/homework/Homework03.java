package homework;

import java.util.Scanner;

public class Homework03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫 번째정수:");
		int num1 = sc.nextInt();
		
		System.out.println("두 번째정수:");
		int num2 = sc.nextInt();
		
		System.out.println("세 번째정수:");
		int num3 = sc.nextInt();
		
		int min = num1;
		if(min > num2) min= num2;
		if(min > num3) min= num3;
		
		System.out.println("가장 작은 수:" + min);
		
			
		

	}

}
