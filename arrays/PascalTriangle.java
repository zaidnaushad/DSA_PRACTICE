import java.util.*;
// Finding the Pascal Triangle
class Solution {
    // Function to Find an Element//
    int nCr(int n, int r) {
        long res = 1;
        for (int i = 0; i < r; i++) {
            res = res * (n - i) / (i + 1);
        }
        return (int) res;
    }

    public List<List<Integer>> generate(int numRows) {
        // Result list each row is to be Added//
        List<List<Integer>> result = new ArrayList<>();
        for (int r = 1; r <= numRows; r++) {
            // List ext where single row is added//
            List<Integer> ext = new ArrayList<>();
            for (int c = 1; c <= r; c++) {
                ext.add(nCr(r - 1, c - 1));
            }
            result.add(ext);
        }
        return result;
    }
}