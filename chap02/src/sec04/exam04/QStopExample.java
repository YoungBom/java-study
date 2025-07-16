package sec04.exam04;

import java.io.IOException;

public class QStopExample {
	
	public static void main(String[] args) throws Exception {
		int keycode;
		
		while (true) { // 무한 반복
			keycode = System.in.read();
			System.out.println("keycode:" + keycode);
			
			// q를 입력하면 종료되도록 만들기
			if(keycode == 113) {
				break; // keycode가 113과 동일할 경우 실행
				}

		}
		System.out.println("종료");
		}
		
}