// 2. [Concatenation of Array](https://leetcode.com/problems/concatenation-of-array/)
import java.util.Scanner;
public class QueSecond {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        int[] ans = getConcatenation(nums);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
    
    public static int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length*2];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
        }
        for (int i = nums.length; i < ans.length; i++) {
            ans[i] = nums[i-nums.length];
        }
        return ans;
    }
}
