package sec02.exam02;

public class TryCatchFinallyRuntimeException {

	public static void main(String[] args) {
		String data1 = null;
		String data2 = null;
		
		try {
			data1 = args[0]; // 실행 예외 발생
			data2 = args[1];
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
			return; // 메소드 종료
		}
		
		try {
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2); // "a20" 같이 문자가 섞이면 실행 예외 발생
			int result = value1 + value2;
			System.out.println(result);
		} catch (NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다.");
		} finally {
			System.out.println("다시 실행하세요.");
		}
		// finally는 예외사항에서 정상 시행되든 예외처리를 하든 무조껀 실행되므로 예외발생시엔 finally로 표기해주고 
		// 그 경우외엔 빼야한다.(유의)
		
		
		
		
		
		
		
		
		
		
	}

}
