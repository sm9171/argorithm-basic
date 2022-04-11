package bakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bak_12891 {
	static int checkArr[];
	static int myArr[];
	static int checkSecret;


	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int S = Integer.parseInt(st.nextToken());
		int P = Integer.parseInt(st.nextToken());
		char A[] = new char[S];
		int result = 0;
		A =  bf.readLine().toCharArray();
		checkArr = new int[4];
		myArr = new int[4];


	}
}
