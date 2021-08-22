// 3. [Running Sum of 1d Array](https://leetcode.com/problems/running-sum-of-1d-array/)
import java.util.Scanner;
public class QueThired {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        int[] ans = runningSum(nums);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
    
    public static int[] runningSum(int[] nums) {
        int[] ans = new int[nums.length];
        ans[0] = nums[0];
        for (int i = 1; i < ans.length; i++) {
            ans[i] = nums[i] + ans[i-1];
        }
        return ans;
    }
}
