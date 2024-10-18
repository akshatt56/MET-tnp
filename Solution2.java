class Solution2
{
    public int findSecondLargest(int[] arr)
    {
        int first = -1, second = -1;
        for (int num : arr)
        {
            if (num > first)
            {
                second = first;
                first = num;
            }
            else if (num > second && num < first)
            {
                second = num;
            }
        }
        return second;
    }

    public static void main(String[] args)
    {
        Solution2 solution = new Solution2();
        int[] arr = {12, 35, 1, 10, 34, 1};
        System.out.println(solution.findSecondLargest(arr));
    }
}