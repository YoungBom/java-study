package sec02.exam03;

public class KumhoTire extends Tire {

	// 생성자
	public KumhoTire(String location, int maxRation) {
		super(location, maxRation);

	}

	// 메소드

	@Override
	public boolean roll() {
		++accmulatedRotation;
		if (accmulatedRotation < maxRation) {
			System.out.println(location + "KumhoTire 수명: " + (maxRation - accmulatedRotation) + "회");
			return true;
		} else {
			System.out.println("***" + location + "KumhoTire 펑크 ***");
			return false;

		}
	}
}
