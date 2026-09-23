class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int left = 0;
        int sum = 0;
        int minLength = Integer.MAX_VALUE;

        for (int right = 0; right < nums.length; right++) {

            // Add current element
            sum += nums[right];

            // If sum is enough, shrink the window
            while (sum >= target) {

                int length = right - left + 1;

                if (length < minLength) {
                    minLength = length;
                }

                // Remove left element
                sum -= nums[left];
                left++;
            }
        }

        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}