class Solution10
{
    public static boolean contains(int[] arr, int k)
    {
        // Iterate through each element in the array
        for (int num : arr)
        {
            if (num == k)
            {
                return true; // Element found
            }
        }
        return false; // Element not found
    }

    public static void main(String[] args)
    {
        int[] arr = {1, 2, 3, 4, 6}; // Sorted array
        int k = 6; // Element to search for

        boolean result = contains(arr, k);
        System.out.println("Is " + k + " present in the array? " + result);
        // Output: Is 6 present in the array? true
    }
}
