// 5. [Shuffle the Array](https://leetcode.com/problems/shuffle-the-array/)
import java.util.Scanner;
public class QueFifth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        int[] ans = shuffle(nums, n/2);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] +" ");
        }
    }
    
    public static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
         int swap = 0;
        int mid = n;
         for (int i = 0; i < nums.length ; i++) {
             ans[i] = nums[swap];
             swap++;
             i++;
             ans[i] = nums[mid];
             mid++;
         }
         return ans;
    }
}
