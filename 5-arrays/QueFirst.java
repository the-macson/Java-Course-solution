import java.util.Scanner;
// 1. [Build Array from Permutation](https://leetcode.com/problems/build-array-from-permutation/)
public class QueFirst {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        int[] ans = buildArray(nums);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }

    public static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
          for (int i = 0; i < nums.length; i++) {
              int an = nums[i];
              ans[i] = nums[an];
          }
          return ans;
    }

}