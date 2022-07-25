package solved.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//이분 탐색 Upper Bound
public class bak_1654 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int K = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		int arr[] = new int[K];
		long min = 0;
		long mid = 0;
		long max = 0;

		for (int i = 0; i < K; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			if (max < arr[i]) {
				max = arr[i];
			}
		}

		max++;

		while (min < max) {

			// 범위 내에서 중간 길이를 구한다.
			mid = (max + min) / 2;


			long count = 0;

			// 구해진 중간 길이로 잘라서 총 몇 개가 만들어지는지를 구한다.

			for (int i = 0; i < arr.length; i++) {
				count += (arr[i] / mid);
			}

			/*
			 *  [upper bound 형식]
			 *
			 *  mid길이로 잘랐을 때의 개수가 만들고자 하는 랜선의 개수보다 작다면
			 *  자르고자 하는 길이를 줄이기 위해 최대 길이를 줄인다.
			 *  그 외에는 자르고자 하는 길이를 늘려야 하므로 최소 길이를 늘린다.
			 */
			if(count < N) {
				max = mid;
			}
			else {
				min = mid + 1;
			}


		}
		System.out.println(min - 1);

		br.close();
	}
}
