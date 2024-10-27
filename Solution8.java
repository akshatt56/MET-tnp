public class Solution8
{
    public static int findSingleNo(int[] nums)
    {
        int result = 0;
        // XOR all elements
        // Because XORing the number with itself as well as with 0 returns "0"
        for (int num : nums)
        {
            result ^= num;
        }
        return result;
    }
    public static void main(String[] args)
    {
        int[] nums = {2, 2, 1};     //giving input array string
        int singleNumber = findSingleNo(nums);
        System.out.println("The single number is: " + singleNumber); // Output: 1
    }
}


