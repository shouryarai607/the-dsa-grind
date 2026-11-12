class Solution {
    public int kConcatenationMaxSum(int[] arr, int k) {
        long sum = 0;
        long maxPrefix = 0;
        long minPrefix = 0;
        long maxSubarray = 0;

        for (int x : arr) {
            sum += x;

            maxPrefix = Math.max(maxPrefix, sum);
            minPrefix = Math.min(minPrefix, sum);

            maxSubarray = Math.max(maxSubarray, sum - minPrefix);
        }

        long ans = maxSubarray;
        int MOD = 1_000_000_007;

        if (k == 1) {
            return (int) (ans % MOD);
        }

        long maxSuffix = sum - minPrefix;

        ans = Math.max(ans, maxPrefix + maxSuffix);

        if (sum > 0) {
            ans = Math.max(ans,
                    maxPrefix + maxSuffix + (long)(k - 2) * sum);
        }

        return (int) (ans % MOD);
    }
}