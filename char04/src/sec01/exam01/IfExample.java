package sec01.exam01;

public class IfExample {

	public static void main(String[] args) {
		// TODO 7/18일 시작점 if문
		
		int score = 93;
		
		if(score >=90) { // 조건식이 true 이기 때문에 if문 내부 실행
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A 입니다.");
		}
		if(score < 90) { // 조건식이 false 이기 때문에 if문 내부 실행 안됨
			System.out.println("점수가 90보다 작습니다."); // 중괄호가 생략된 IF문의 범위는 다음 실행문 하나까지다.
			System.out.println("등급은 B 입니다.");
			
		// 코드가 아직 익숙하지 않을 때는 실행문이 하나뿐인 경우에도 중괄호 써주기	
			
		}
	}

}
