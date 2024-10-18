public class Solution5
{
    public int missingNumber(int[]nums)
    {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        // Calculate the sum of elements in the array
        for (int num : nums)
        {
            actualSum += num;
        }

        // The missing number = expected sum - actual sum
        return expectedSum - actualSum;
    }

    public static void main(String[] args)
    {
        Solution5 solution = new Solution5();
        int[] nums = {3, 0, 1};
        System.out.println("The missing number is: " + solution.missingNumber(nums));
    }
}