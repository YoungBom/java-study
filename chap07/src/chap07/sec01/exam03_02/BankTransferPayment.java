package chap07.sec01.exam03_02;

public class BankTransferPayment extends PaymentService {
// 자식 클래스: 계좌이체 결제
	
	@Override
	public void pay(int amount) {
		System.out.println("계좌이체 결제 선택됨");
		System.out.println("가상 계좌로  입금 확인중...");
		System.out.println("계좌이체로 " + amount + "원 결제 완료" );
	}
	
}
