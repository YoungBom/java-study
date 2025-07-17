package sec01.exam01;

public class VariableinitializationExample {

	public static void main(String[] args) {
//		int value;
//		int result = value + 10; // 컴파일 에러 발생
		// 초기화를 하지 않은 변수는 메모리에 생성되지 않기에 값을 읽을 수 없음
		// 초기화: 변수에 최초로 값을 저장하는 행위

		int value = 30;
		int result = value + 10;
		System.out.println(result);
		// 정수타입 : byte,short,int,long
		// 실수타입 : float,double
		// 논리타입 : boolean
		
		// 크기에 따른 변수 타입 : byte,boolean(1byte) < char,short(2byte) < int,float(4byte) < long,double(8byte)
		// 1byte = 8bit bit is 0 or 1 2진수로 저장될수 있는 최소단위의 공간
		// 즉 double타입은 8byte = 64bit 
		// byte 범위 -128~127
		// short 범위 대략 -3만2천~3만2천
		// char 범위 0~65535
		// int 범위 -21억~21억
		// long 범위 여튼 겁나큰 - +
		
		
	}

}
