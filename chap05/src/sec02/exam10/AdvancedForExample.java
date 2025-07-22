package sec02.exam10;

public class AdvancedForExample {

	public static void main(String[] args) {
		// 향상된 for문 (for- each문이라고도 함)
		// 실무에서 정말 많이 쓰이고 for문의 index값을 알고싶은게 아니라면  for each문을씀)
		
		
		
		int[] scores = {95, 71, 84, 93, 87};
		
		int sum = 0;
		for (int score : scores) {
			sum = sum + score;
			
		}
		System.out.println("점수총합:" + sum);
		
		double avg = sum / (double)scores.length;
		System.out.println("점수 평균=" + avg);
		
		// 정리:
		// 기본 for문 보다 코드가 간결하여 자주 쓰임
		// 배열 index 값의 사용이 필요할 때는 기본 for문 사용
		
	}

}
