package homework;

import java.util.Scanner;

public class Homework05 {

	public static void main(String[] args) {
		
//		double ko = 89;
//		double en = 73;
//		double ma = 45;
//		System.out.println(ko + en + ma);
//		System.out.println((ko + en + ma) /3 );
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어: ");
		double korean = sc.nextDouble();
 
		System.out.print("영어: ");
		double english = sc.nextDouble();
		
		System.out.print("수학: ");
		double math = sc.nextDouble();
		
		int total = (int) (korean + english + math);
		int avg = total / 3;
		
		System.out.println("총점: " + total);
		System.out.println("평균: " + avg);
		
		
		
		/*국어 : 89
		영어 : 73
		수학 : 45
		총점 : 207
		평균 : 69*/
	}

}
