package bakjoon.category.ex8bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Boj_2178 {
    private static class Pair{
        private int x;
        private int y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public void setX(int x) {
            this.x = x;
        }

        public void setY(int y) {
            this.y = y;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        char[][] miro = new char[N][M];
        int[][] dist = new int[N][M];
        int[] dx = new int[]{1, 0, -1, 0};
        int[] dy = new int[]{0, 1, 0, -1};

        Queue<Pair> queue = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < M; j++) {
                miro[i][j] = line.charAt(j);
                dist[i][j] = -1;
            }
        }

        queue.offer(new Pair(0, 0));
        dist[0][0] = 0;

        while (!queue.isEmpty()) {
            Pair p = queue.poll();

            for (int i = 0; i < 4; i++) {
                int nX = p.x + dx[i];
                int nY = p.y + dy[i];
                // 벽에 부딪히거나, 범위를 넘어가면 PASS
                if(nX < 0 || nX >= N || nY < 0 || nY >= M){
                    continue;
                }
                // 길이 아니거나, 방문을 했다면 PASS
                if(miro[nX][nY] == '0' || dist[nX][nY] != -1){
                    continue;
                }

                queue.offer(new Pair(nX, nY));
                dist[nX][nY] = dist[p.x][p.y] + 1;
            }
        }

        System.out.print(dist[N-1][M-1] + 1);
    }
}
