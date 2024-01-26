package programers;

import java.util.ArrayList;
import java.util.List;

// 옮기려는 원판의 개수 n
// 원판이 현재 위치한 기둥 from
// 원판이 이동해야 하는 기둥 to
public class exam16 {
	public static void main(String[] args) {
		int n = 2;
		List<int[]> hanoi = hanoi(n, 1, 3);
		for (int[] ints : hanoi) {
			System.out.println(ints[0] + " " + ints[1]);
		}
	}
	private static List<int[]> hanoi(int n, int from, int to) {
		if (n == 1) {
			return List.of(new int[]{from, to});
		}
		int empty = 6 - from - to;
		List<int[]> result = new ArrayList<>();
		result.addAll(hanoi(n - 1, from, empty));
		result.addAll(hanoi(1, from, to));
		result.addAll(hanoi(n - 1, empty, to));

		return result;
	}
}
