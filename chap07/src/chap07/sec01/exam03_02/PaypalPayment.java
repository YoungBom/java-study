package chap07.sec01.exam03_02;

public class PaypalPayment extends PaymentService{
	@Override
	public void pay(int amount) {
		System.out.println("Paypal 결제 선택됨");
		System.out.println("Paypal  서버와 연결중...");
		System.out.println("Paypal로 " + amount + "원 결제 완료" );

	}
}