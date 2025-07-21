package sec01.exam05;

public class MainStringArrayArgument {

	public static void main(String[] args) {
		System.out.println(args.length);
		// 메인 메소드를 쓸때 args.length가 어떤 역할을 하는지만 알아둘것. 외부의 값을 받아오는것.
		// 거의 안나오지만 알아만 둘것.
		// 툴에서 직접 실행할 때 argument 주는 방법: Run Configurations > Arguments
		// argument = 매개값, 인자값, 인수 라고도 한다 자주 나오니 익힐것.
		// main 메소드의 String[] 배열 매개변수 활용하기
		if(args.length != 2) {
			System.out.println("값의 수가 부족합니다.");
		//	return;	// 메소드 종료
			System.exit(0); // 프로그램(JVM) 강제 종료 코드
			// 여기서 0은 정상 종료를 의미
			
		}
		
		String strNum1 = args[0];
		String strNum2 = args[1];
		
		// Quiz: 문자열을 정수(int)로 변환해서 더한 결과를 출력
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + result);

		// TODO : 처음으로 받아쓰기말고 생각해내서 맞춘문제!
		
		
	}

}
