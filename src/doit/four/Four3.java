package doit.four;


import java.util.ArrayList;
import java.util.HashMap;

public class Four3 {
    public static void main(String[] args) {
        int n = 7;
        int k = 4;
        int[] arr = {20, 12, 20, 10, 23, 17, 10};


        Four3 T = new Four3();

        for (int x : T.solution(n, k, arr)) {
            System.out.print(x+ " ");
        }

    }
    private ArrayList<Integer> solution(int n, int k, int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> HM = new HashMap<>();
        for (int i = 0; i < k - 1; i++) {
            HM.put(arr[i], HM.getOrDefault(arr[i], 0) + 1);
        }
        int lt = 0;
        for (int rt = k - 1; rt < n; rt++) {
            HM.put(arr[rt], HM.getOrDefault(arr[rt], 0) + 1);
            result.add(HM.size());
            HM.put(arr[lt], HM.get(arr[lt]) - 1);
            if (HM.get(arr[lt]) == 0) {
                HM.remove(arr[lt]);
            }
            lt++;
        }
        return result;
    }
}
