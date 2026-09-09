class Solution {
    public void nextPermutation(int[] nums) {

        int l = nums.length - 1;

        // Find the first smaller element from right
        for (int sl = nums.length - 2; sl >= 0; sl--) {

            if (nums[sl] < nums[sl + 1]) {

                // Find the smallest element greater than nums[sl]
                while (nums[l] <= nums[sl]) {
                    l--;
                }

                // Swap
                int temp = nums[l];
                nums[l] = nums[sl];
                nums[sl] = temp;

                // Sort remaining part using while loop
                int i = sl + 1;

                while (i < nums.length - 1) {

                    int j = i + 1;

                    while (j < nums.length) {

                        if (nums[i] > nums[j]) {
                            int t = nums[i];
                            nums[i] = nums[j];
                            nums[j] = t;
                        }

                        j++;
                    }

                    i++;
                }

                return;
            }
        }

        // If already the largest permutation,
        // reverse the whole array
        int i = 0;
        int j = nums.length - 1;

        while (i < j) {

            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;

            i++;
            j--;
        }
    }
}