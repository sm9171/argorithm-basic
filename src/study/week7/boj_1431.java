package study.week7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class boj_1431 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		ArrayList<String> serials = new ArrayList<>();
		while (N --> 0){
			serials.add(br.readLine());
		}

		Collections.sort(serials, (o1, o2) -> {
			if(o1.length() == o2.length()) {
				int o1Sum = 0;
				int o2Sum = 0;
				for (int i = 0; i < o1.length(); i++) {
					if (o1.charAt(i) >= '0' && o1.charAt(i) <= '9') {
						o1Sum += o1.charAt(i) - '0';
					}
					if (o2.charAt(i) >= '0' && o2.charAt(i) <= '9') {
						o2Sum += o2.charAt(i) - '0';
					}
				}
				if (o1Sum == o2Sum) {
					return o1.compareTo(o2);
				}
				return Integer.compare(o1Sum, o2Sum);
			}
			return o1.length() - o2.length();
		});
		StringBuilder sb = new StringBuilder();
		for (String serial : serials) {
			sb.append(serial).append("\n");
		}
		System.out.println(sb);
	}
}
