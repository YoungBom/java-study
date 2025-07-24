package sec05.exam06;

public class Earth {
	// 불변의 값 상수 만들기
	// 관례적으로 모두 대문자로 작성한다, 단어와 단어 사이에는 언더바로 연결한다. 상수를 만들때는...
	static final double EARTH_RADIUS = 6400; 
	static final double EARTH_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
	
	// 생성자에서 초기화 할 수 없음
	// 이유? 생성자는 객체 생성시 호출되어 초기화 하기 때문이다.
//	public Earth() {
//		EARTH_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
	
	

	// (참고만) 선언 시 초기화를 안했을 경우 static 블록에서 초기화 가능,안씀(책에x)
//	static {
//		EARTH_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
//	}
}