/*1337. The K Weakest Rows in a Matrix
https://leetcode.com/problems/the-k-weakest-rows-in-a-matrix/
*/


class kWeakestRowsIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
          {1,1,0,0,0},
          {1,1,1,1,0},
          {1,0,0,0,0},
          {1,1,0,0,0},
          {1,1,1,1,1}
        };

        int k = 3;

        System.out.println(Arrays.toString(kWeakestRows(arr, k)));
    }

    static int[] kWeakestRows(int[][] arr, int k) {
        int ans[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ans[i] = binarySearch(arr[i]) * arr.length + i;
        }
        Arrays.sort(ans);

        for (int i = 0; i < arr.length; i++) {
            ans[i] = ans[i] % arr.length;
        }
        return Arrays.copyOfRange(ans, 0, k);
    }

    static int binarySearch(int[] mat) {
        int start = 0;
        int end = mat.length;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mat[mid] == 1) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }
}
