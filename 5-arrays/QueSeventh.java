import java.util.Scanner;

// 7. [Number of Good Pairs](https://leetcode.com/problems/number-of-good-pairs/)
public class QueSeventh {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        int ans = numIdenticalPairs(nums);
        System.out.println(ans);
    }
    
    public static int numIdenticalPairs(int[] nums) {
         int ans = 0;
         for (int i = 0; i < nums.length; i++) {
             for(int j = i+1; j <nums.length; j++){
                 if (nums[i] == nums[j]) {
                     ans++;
                 }
             }
         }
          return ans;
    }
}
