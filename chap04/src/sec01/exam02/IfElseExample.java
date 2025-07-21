package sec01.exam02;

public class IfElseExample {

	public static void main(String[] args) {
		int score = 85;
		
		if(score >=90) { // 조건식이 true 이기 때문에 if문 내부 실행
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A 입니다.");
			
		}else { // 조건식이 false 이기 때문에 if문 내부 실행 안됨
			System.out.println("점수가 90보다 작습니다."); 
			System.out.println("등급은 B 입니다.");
		
		}
		
	}
}