package programmers.week3.solved;

public class Solved7 {
	private int solution(int[][] triangle) {
		for (int i = triangle.length; i >= 0; i--) {
			for (int j = 0; j < triangle[i].length; j++) {
				int left = triangle[i][j] + triangle[i + 1][j];
				int right = triangle[i][j] + triangle[i + 1][j+1];
				triangle[i][j] = Math.max(left, right);
			}
		}
		return triangle[0][0];
	}
}
