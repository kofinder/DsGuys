package codility;

import java.util.List;

public class Test1 {

    public static int maxNetworkRank(List<Integer> starts, List<Integer> ends, int n) {
        int[] edgeCount = new int[n];
        int m = starts.size();
        int maxRank = Integer.MIN_VALUE;

        for (int i = 0; i < m; i++) {
            edgeCount[starts.get(i) - 1]++;
            edgeCount[ends.get(i) - 1]++;
        }

        for (int i = 0; i < m; i++) {
            int rank = edgeCount[starts.get(i) - 1] + edgeCount[ends.get(i) - 1] - 1;
            if (rank > maxRank) {
                maxRank = rank;
            }
        }

        return maxRank;
    }

    static int solution(int[] A, int[] B, int N) {
        int[] edgeCount = new int[N];
        int m = A.length;
        int result = Integer.MIN_VALUE;

         for (int i = 0; i < m; i++) {
            edgeCount[A[i] - 1]++;
            edgeCount[B[i] - 1]++;
        }

        for (int i = 0; i < m; i++) {
            int rank = edgeCount[A[i] - 1] + edgeCount[B[i] - 1] - 1;
            if (rank > result) {
                result = rank;
            }
        }

        return result;
    }
    public static void main(String[] args) {

    }
}
