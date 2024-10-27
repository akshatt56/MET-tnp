import java.util.*;
public class Solution7
{
        public static List<Integer> findUnion(int[] a, int[] b)
        {
            // Here we are using treeSet to store elements in sorted order and to avoid duplicates

            Set<Integer> set = new TreeSet<>();

            // Here we are adding elements from both arrays to the set

            for (int num : a)
            {
                set.add(num);
            }
            for (int num : b)
            {
                set.add(num);
            }

            // Here we are converting the set to a list to return the union in sorted order
            return new ArrayList<>(set);
        }

        public static void main(String[] args)
        {
            int[] a = {1, 2, 3, 4, 5};
            int[] b = {1, 2, 3, 6, 7};

            List<Integer> result = findUnion(a, b);
            System.out.println(result);
        }
    }

