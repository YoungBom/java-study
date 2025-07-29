package sec02.exam01;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();

		myCar.run();
		
		myCar.frontLeftTire = new KumboTire();
		myCar.frontRightTire = new KumboTire();

		myCar.run();
	}

}
