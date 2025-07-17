package homework;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {

//		float weight = 70.0f;
//		float height = 1.80f;
//		System.out.println(weight /(height * height) );

		Scanner sc = new Scanner(System.in); // 선생님이 제시해주신 방식은 내가 직접 입력하여 어떤 숫자가 나오든 계산식에서 계산할 수 있게
											// 스캐너를 활용한 방법 (다시 숙지)
		System.out.println("몸무게(kg):");
		double weight = sc.nextDouble();

		System.out.println("키(m):");
		double height = sc.nextDouble();

		double bmi = weight / (height * height);
		//System.out.println("BMI 지수:" + bmi);  이 방식은 소수점 자리까지 전부출력한다.   
		//System.out.printf("BMI 지수: %.1f\n" , bmi); //이럴때엔 프린트f로 소수점 자리 출력까지를 의도한다.
		System.out.println("BMI 지수:" + (int) (bmi * 10) / 10.0); // 이 방식은
	}

}

// chap02. 변수 과제
// https://devkgn24.notion.site/149fda8bae5780cc9497f6d5d179ac38
// 문자열에서 특정 인덱스의 문자를 추출하는 메소드 charAt()