import java.util.*;

class Solution {
    public List<List<Integer>> generate(int numRows) {
       
        int[][] arr = new int[numRows][];
        for (int i = 0; i < numRows; i++) {
            arr[i] = nCr(i + 1);
        }

        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int val : arr[i]) {
                row.add(val);
            }
            result.add(row);
        }

        return result;
    }

    public int[] nCr(int m) {
        int res = 1;
        int[] arr = new int[m];

        arr[0] = 1;
        for (int i = 1; i < m; i++) {
            res = res * (m - i);
            res = res / i;
            arr[i] = res;
        }

        return arr;
    }
}
