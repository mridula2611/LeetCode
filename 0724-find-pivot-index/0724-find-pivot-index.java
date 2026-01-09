class Solution {
    public int pivotIndex(int[] nums) {
        // Step 1: Calculate total sum
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        // Step 2: Initialize left sum
        int leftSum = 0;

        // Step 3: Traverse array
        for (int i = 0; i < nums.length; i++) {

            int rightSum = totalSum - leftSum - nums[i];

            if (leftSum == rightSum) {
                return i;   // pivot index found
            }

            leftSum += nums[i];
        }

        // Step 4: No pivot index
        return -1;
    }
}
