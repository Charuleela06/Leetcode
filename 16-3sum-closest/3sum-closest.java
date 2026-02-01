import java.util.Arrays;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
            Arrays.sort(nums);
                    int n = nums.length;

                            // Initialize with sum of first three elements
                                    int closestSum = nums[0] + nums[1] + nums[2];

                                            for (int i = 0; i < n - 2; i++) {
                                                        int left = i + 1;
                                                                    int right = n - 1;

                                                                                while (left < right) {
                                                                                                int currentSum = nums[i] + nums[left] + nums[right];

                                                                                                                // Update closestSum if current is closer to target
                                                                                                                                if (Math.abs(currentSum - target) < Math.abs(closestSum - target)) {
                                                                                                                                                    closestSum = currentSum;
                                                                                                                                                                    }

                                                                                                                                                                                    if (currentSum < target) {
                                                                                                                                                                                                        left++;   // need a larger sum
                                                                                                                                                                                                                        } else if (currentSum > target) {
                                                                                                                                                                                                                                            right--;  // need a smaller sum
                                                                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                                                                                // Exact match
                                                                                                                                                                                                                                                                                                    return currentSum;
                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                return closestSum;
                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                    