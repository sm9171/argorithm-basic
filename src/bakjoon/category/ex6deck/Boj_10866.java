package bakjoon.category.ex6deck;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_10866 {

	static int front = 10000;
	static int back = 10000;
	static int size = 0;
	static int[] deque = new int[20001];

	public static void main(String[] args) throws IOException {
		StringBuffer sb = new StringBuffer();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String input = st.nextToken();
			switch (input) {
				case "push_front":
					push_front(Integer.parseInt(st.nextToken()));
					break;
				case "push_back":
					push_back(Integer.parseInt(st.nextToken()));
					break;
				case "pop_front":
					sb.append(pop_front()).append('\n');
					break;
				case "pop_back":
					sb.append(pop_back()).append('\n');
					break;
				case "size":
					sb.append(size()).append('\n');
					break;
				case "empty":
					sb.append(empty()).append('\n');
					break;
				case "front":
					sb.append(front()).append('\n');
					break;
				case "back":
					sb.append(back()).append('\n');
					break;
			}
		}
		System.out.println(sb);
	}

	private static void push_front(int num) {
		deque[front] = num;
		front--;
		size++;
	}

	private static void push_back(int num) {
		back++;
		size++;
		deque[back] = num;
	}

	private static int pop_front() {
		if (size == 0) {
			return -1;
		}
		int ret = deque[front + 1];
		front++;
		size--;
		return ret;
	}

	private static int pop_back() {
		if (size == 0) {
			return -1;
		}
		int ret = deque[back];
		back--;
		size--;
		return ret;
	}

	private static int size() {
		return size;
	}

	private static int empty() {
		if(size == 0) {
			return 1;
		}
		return 0;
	}

	private static int front() {
		if(size == 0) {
			return -1;
		}
		return deque[front + 1];
	}

	private static int back() {
		if(size == 0) {
			return -1;
		}
		return deque[back];
	}
}
