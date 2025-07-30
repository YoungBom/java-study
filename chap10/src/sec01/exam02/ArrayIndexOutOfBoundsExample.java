package sec01.exam02;

public class ArrayIndexOutOfBoundsExample {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3};
		int result = arr[0] + arr[2];
//		int result = arr[0] + arr[3]; // 예외 발생
		
		System.out.println(result);
		
		String data1 = args[0]; // 예외 발생: args는 실행문의 대표 매개변수인데 이렇게 설정하게되면 args는 빈배열을 가져온다. 그러므로 실행시에 범위를 벗어난 실행에러가 뜬다.
		String data2 = args[1];

		
		System.out.println("args[0]" + data1);
		System.out.println("args[1]" + data2);
	}

}
