package chap07.sec01.exam03_02;

// 부모 클래스 : 공통 결제 서비스 -> (추상화) -> 추상 클래스
public abstract class PaymentService {
//	public void pay(int amount)  // <-- 실제로는 실행 안됨(왜냐하면 자식객체에서 전부 메소드 재정의(오버라이딩)를 하고 있기 때문
//		System.out.println("결제 금액: " + amount + "원");  // 그래서 굳이 출력문을 붙일 필욘없다. 일반적인 상황에선 밑에와 같이 추상 메소드를 붙인다.
//		System.out.println("결제를 처리합니다.");
		
	// 추상 메소드: 자식 클래스에서 반드시 구현해야 한다. (=abstract 로 앞에 붙여준다. 클래스 앞또한 붙인다.)
	public abstract void pay(int amount);	

}