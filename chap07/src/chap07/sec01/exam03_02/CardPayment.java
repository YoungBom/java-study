package chap07.sec01.exam03_02;

// 자식 클래스: 신용카드 결제
public class CardPayment extends PaymentService {
	@Override
	public void pay(int amount) {
		System.out.println("카드 결제 선택됨");
		System.out.println("카드사 승인 요청중...");
		System.out.println("카드로 " + amount + "원 결제 완료" );

	}
}