package solved.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//에라토스테네스의 체
public class bak_1929 {

	public static boolean[] prime;	// 소수를 체크할 배열
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());

		prime = new boolean[N + 1];
		get_prime();

		StringBuffer sb = new StringBuffer();
		for (int i = M; i <= N; i++) {
			if(prime[i] == false) {	// 소수(false)일 경우 출력
				sb.append(i).append('\n');
			}
		}
		System.out.println(sb);

		br.close();
	}

	// 에라토스테네스의 체 알고리즘
	public static void get_prime() {
		// true = 소수아님 , false = 소수
		prime[0] = prime[1] = true;

		for(int i = 2; i <= Math.sqrt(prime.length); i++) {
			if(prime[i]) continue;
			for(int j = i * i; j < prime.length; j += i) {
				prime[j] = true;
			}
		}
	}
}
