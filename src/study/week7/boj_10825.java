package study.week7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class boj_10825 {

	static class Student{
		String name;
		int kor;
		int eng;
		int math;

		public Student(String name, int kor, int eng, int math) {
			this.name = name;
			this.kor = kor;
			this.eng = eng;
			this.math = math;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		ArrayList<Student> students = new ArrayList<>();

		while (N --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			int kor = Integer.parseInt(st.nextToken());
			int eng = Integer.parseInt(st.nextToken());
			int math = Integer.parseInt(st.nextToken());

			students.add(new Student(name, kor, eng, math));
		}

//		국어 점수가 감소하는 순서로
//		국어 점수가 같으면 영어 점수가 증가하는 순서로
//		국어 점수와 영어 점수가 같으면 수학 점수가 감소하는 순서로
//		모든 점수가 같으면 이름이 사전 순으로 증가하는 순서로 (단, 아스키 코드에서 대문자는 소문자보다 작으므로 사전순으로 앞에 온다.)
		Collections.sort(students, (o1, o2) -> {
			if (o1.kor == o2.kor) {
				if (o1.eng == o2.eng) {
					if (o1.math == o2.math) {
						return o1.name.compareTo(o2.name);
					}
					return Integer.compare(o2.math, o1.math);
				}
				return Integer.compare(o1.eng, o2.eng);
			}
			return Integer.compare(o2.kor, o1.kor);
		});

		StringBuilder sb = new StringBuilder();
		for (Student student : students) {
			sb.append(student.name).append('\n');
		}

		System.out.println(sb);
	}
}
