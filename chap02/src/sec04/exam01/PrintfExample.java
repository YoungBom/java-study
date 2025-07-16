package sec04.exam01;

public class PrintfExample {

	public static void main(String[] args) {
		int value = 123;
		System.out.printf("상품의 가격: %d원\n", value );
		System.out.printf("상품의 가격: %6d원\n", value );
		System.out.printf("상품의 가격: %-6d원\n", value );
		System.out.printf("상품의 가격: %06d원\n", value );

		double area = 3.14159 * 10 * 10;
		System.out.printf("반지름이 %1$d인 원의 넓이: %2$10f\n", 10, area); // 순번을 생략하면 차례대로 대입됨
		// $ 는 순번을 정해주는 명령어이다. 1$면 가능 첫번째 위치에 들어가야하는 값
		//2$면 두번째 위치에 들어간다.
		
		String name = "홍길동";
		String job = "도적";
		System.out.printf("%6d| %-10s | %10s\n", 1, name, job);
		
		
	}

}
