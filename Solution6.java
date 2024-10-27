public class Solution6
{
    public void rotate(int[] nums, int k)
    {
        reverse(nums, 0, nums.length-1);    //here we are reversing the array
        reverse(nums, 0, k-1);      //here we are reversing the first k elements
        reverse(nums, k, nums.length-1);        //here we are reversing the remaining elements
    }
    private void reverse(int[] nums, int start, int end)
    {
        while(start < end)
        {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}


