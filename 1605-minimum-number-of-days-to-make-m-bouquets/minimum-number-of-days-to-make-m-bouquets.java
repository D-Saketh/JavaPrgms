class Solution {

    public boolean possible(int[] nums, int day, int m, int k) {
        int fcount = 0, bouq = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= day) { // flower has bloomed
                fcount++;
            } else {
                bouq += (fcount / k);
                fcount = 0;
            }
        }

        bouq += (fcount / k);
        return bouq >= m;
    }

    public int minDays(int[] bloomDay, int m, int k) {

        int n = bloomDay.length;

        long val = (long) m * k;
        if (val > n) return -1;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            min = Math.min(min, bloomDay[i]);
            max = Math.max(max, bloomDay[i]);
        }

        int left = min, right = max;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (possible(bloomDay, mid, m, k)) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }
}