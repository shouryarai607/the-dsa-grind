class Solution {
    public int numSubmatrixSumTarget(int[][] matrix, int target) {

        int m = matrix.length;
        int n = matrix[0].length;

        int count = 0;

        for (int left = 0; left < n; left++) {

            int[] arr = new int[m];

            for (int right = left; right < n; right++) {

                for (int row = 0; row < m; row++) {
                    arr[row] += matrix[row][right];
                }

                HashMap<Integer, Integer> map = new HashMap<>();
                map.put(0, 1);

                int sum = 0;

                for (int x : arr) {
                    sum += x;

                    count += map.getOrDefault(sum - target, 0);

                    map.put(sum, map.getOrDefault(sum, 0) + 1);
                }
            }
        }

        return count;
    }
}