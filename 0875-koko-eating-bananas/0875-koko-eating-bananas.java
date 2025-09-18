class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = maxBanana(piles);
        int ans = high;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            long total = totalHours(piles, mid, h); // use long and early exit
            if (total <= (long) h) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    private int maxBanana(int[] arr) {
        int max = 0;
        for (int v : arr) max = Math.max(max, v);
        return max;
    }

    // returns total hours at 'speed'; stops early if total > limit
    private long totalHours(int[] piles, int speed, int limit) {
        long total = 0L;
        long s = speed;
        for (int v : piles) {
            total += (v + s - 1) / s; // ceil division using long arithmetic
            if (total > limit) return total; // early exit avoids huge sums / overflow
        }
        return total;
    }
}
