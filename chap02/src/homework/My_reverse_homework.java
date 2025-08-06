package homework;

import java.util.Scanner;

public class My_reverse_homework {

	public static void main(String[] args) {
//입력받는다 = 스캐너
//
//체질량 지수(BMI)출력 요구
//
//Scaaner sc = new Scanner(System.in); (키보드를 통해 값을 입력받음.)
//체질량 지수 계산공식 
//
//몸무게 (kg)/ (키*키) (m)
	Scanner sc = new Scanner(System.in);
	System.out.print("몸무게(kg): ");
	double weight = sc.nextDouble();
	
	System.out.print("키(m): ");
	double height = sc.nextDouble();
	double height1 = height / 100;
	double bmi = weight / (height1 * height1);
	System.out.printf("체질량지수(BMI): %.1f\n " , bmi);
	
	
	}

}
