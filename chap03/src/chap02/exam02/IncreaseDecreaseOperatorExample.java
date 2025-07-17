package chap02.exam02;

public class IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {
		// TODO: 다시 연습할것.
		// 매우중요한 증감 연산자 파트(많이쓰이고 헷갈리고 여튼중요)
		// 매우중요한 증감 연산자 파트(많이쓰이고 헷갈리고 여튼중요)
		// 매우중요한 증감 연산자 파트(많이쓰이고 헷갈리고 여튼중요) ==> 단독으로 사용시에는 큰 문제없으나 다른 연산자랑 함께쓸땐 헷갈림
		// ++가 앞에 붙냐 뒤에 붙냐에 따라 값이 달라짐

		int x = 10;
		int y = 10;
		int z;

		System.out.println("------------------"); // 헷갈리지 않게 만든 구분선이다.
		x++; // x = x + 1; => 11
		++x; // x = x + 1; => 12
		System.out.println("x=" + x);

		System.out.println("------------------");
		y--; // y = y -1; => 9
		--y; // y = y -1; => 8

		System.out.println("y=" + y);

		// 다른 연산자와 같이 쓸때
		System.out.println("------------------");
		// 후위 연산자는 값을 먼저 사용한 뒤 증감시키는 연산자
		z = x++; // z= x; = x + 1;
		System.out.println("z=" + z);
		System.out.println("x=" + x);

		System.out.println("------------------"); 
		// 전위 연산자는 값을 먼저 증감시킨뒤 사용하는 연산자
		z = ++x; // x = x + 1; z = x;
		System.out.println("z=" + z);
		System.out.println("x=" + x);

		System.out.println("------------------"); 
		z= ++x + y++; // x = x + 1; z = x + y; y = y + 1;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		
		System.out.println("------------------"); 
		// Quiz
		// 다음 코드 실행 후 x의 값은?
		x = 3;
		
		if(x++ == 3) {
			x++; //4
		}// z = x; = x+1;
		System.out.println("x=" + x);
		
		System.out.println("------------------"); 
		// 다음 코드 실행 후 x,y의 값은?
		x = 1;	
		y = x++ + ++x + x; // y = 2 + 2 + 2 = 6?
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		
		
		
		
		}
	}

