import java.util.Scanner;

// 8. [How Many Numbers Are Smaller Than the Current Number](https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number)
public class QueEight {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        int[] ans = smallerNumbersThanCurrent(nums);
        for (int i : ans) {
            System.out.print(ans[i]+" ");
        }
    }
    
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < ans.length; j++) {
                if (nums[i] > nums[j]) {
                    ans[i]++;
                }
            }
        }
        return ans;
    }
}
