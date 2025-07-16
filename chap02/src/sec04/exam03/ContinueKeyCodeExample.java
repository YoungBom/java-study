package sec04.exam03;

import java.io.IOException;

public class ContinueKeyCodeExample {

	public static void main(String[] args) throws Exception {
		int keycode;
		
		while (true) { // 무한 반복
			keycode = System.in.read();
			System.out.println("keycode:" + keycode);
			
	}

}
}