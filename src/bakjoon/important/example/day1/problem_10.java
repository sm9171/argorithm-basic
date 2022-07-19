package bakjoon.important.example.day1;

import java.io.*;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;

//숫자의 갯수, 슬라이딩 윈도우의 크기 값을 주고 슬라이딩 윈도우 범위안의 최솟값을 노출
public class problem_10 {
    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 출력을 그때 그때 하는 것보다 버퍼에 넣고 한번에 출력하기 위해 BufferedWriter를 사용
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());


        bw.flush();
        bw.close();
    }


}
