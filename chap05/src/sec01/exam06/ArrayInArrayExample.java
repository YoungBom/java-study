package sec01.exam06;

public class ArrayInArrayExample {

	public static void main(String[] args) {
		// 2행 3열의 2차원 배열
		int[][] mathScores = new int[2][3];

		// 2차원 배열의 모든 요소에 접근하려면 중첩 for문이 필요
		// 바깥 for문 => 행을 반복
		for (int i = 0; i < mathScores.length; i++) { // mathCsores.length => 2
			// 안쪽 for문 => 열을 반복
			for (int j = 0; j < mathScores[i].length; j++) { // mathCsores[i].length => 3
				System.out.println("mathScores[" + i + "][" + j + "]=" + mathScores[i][j]);

			}

			System.out.println();

			// 2행의 2차원 배열
			int[][] englishScore = new int[2][];
			englishScore[0] = new int[2];
			englishScore[1] = new int[3];
			
			for (int i1 = 0; i < englishScore.length; i1++) { 
				// 안쪽 for문 => 열을 반복
				for (int j = 0; j < englishScore[0].length; j++) { 
					System.out.println("mathScores[" + i1 + "][" + j + "]=" + englishScore[i1][j]);

				}

			System.out.println();
			
			
			// 값 목록으로 2차원 배열 만들기
//			int[][] javaScores = {{95, 80},{92, 96, 80}}; 가독성이 떨어져서 줄바꿈하는 것이 좋다.
			int[][] javaScores = {
					{95, 80},
					{92, 96, 80}
			};
			
			for (int i2 = 0; i < englishScore.length; i++) { 
				// 안쪽 for문 => 열을 반복
				for (int j = 0; j < englishScore[0].length; j++) { 
					System.out.println("mathScores[" + i + "][" + j + "]=" + englishScore[i1][j]);
				}
			}
		}

	}
}
}
