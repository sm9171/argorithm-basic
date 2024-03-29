package bakjoon.important.day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

//방향 없는 그래프에서 연결 요소 갯수 구하기, 노드와 엣지 값이 주어짐
//DFS
//bak_11724
public class problem_23 {
    static ArrayList<Integer>[] A;
    static boolean visited[];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        A = new ArrayList[n + 1];
        visited = new boolean[n + 1];
        for (int i = 1; i < n + 1; i++) { // 인접 리스트 초기화
            A[i] = new ArrayList<Integer>();
        }
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            A[s].add(e); // 양 방향 간선이므로 양쪽으로 간선을 더 해준다
            A[e].add(s);
        }
        int count = 0;
        for (int i = 1; i < n + 1; i++) {
            if (!visited[i]) { // 미 방문한 정점이 없을 때까지 반복
                count++;
                DFS(i);
            }
        }
        System.out.println(count);
    }
    static void DFS(int v) {
        if (visited[v]) {
            return;
        }
        visited[v] = true;
        for (int i : A[v]) {
            if (visited[i] == false) { // 연결 정점 중 방문하지 않았던 정점만 탐색함
                DFS(i);
            }
        }
    }
}
