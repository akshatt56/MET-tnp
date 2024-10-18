public class Solution1
{
    public int findLargest(int[] arr)
    {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++)
        {
            if (arr[i] > max)
            {
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args)
    {
        Solution1 solution = new Solution1();
        int[] arr = {1, 8, 7, 56, 90};
        System.out.println(solution.findLargest(arr));
    }
}