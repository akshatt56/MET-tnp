class Solution4
{
    public int removeDuplicates(int[] nums)
    {
        if (nums.length == 0)
            return 0;

        int k = 1;

        for (int i = 1; i < nums.length; i++)
        {
            if (nums[i] != nums[k - 1])
            {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args)
    {
        Solution4 solution = new Solution4();
        int[]nums = {1, 1, 2};
        int k = solution.removeDuplicates(nums);
        System.out.println("k = " + k);
        System.out.print("nums = ");
        for (int i = 0; i < k; i++)
        {
            System.out.print(nums[i] + " ");
        }
    }
}