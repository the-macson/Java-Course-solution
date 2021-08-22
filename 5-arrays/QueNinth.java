// 9. [Create Target Array in the Given Order](https://leetcode.com/problems/create-target-array-in-the-given-order/)
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class QueNinth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        int[] index = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        for (int i = 0; i < nums.length; i++) {
            index[i] = in.nextInt();
        }
        int[] ans1 = createTargetArray(nums,index);
        for (int i : ans1) {
            System.out.print(ans1[i] + " ");
        }
        
    }
    
    public static int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> ans = new ArrayList<>();
        int[] ans1 = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans.add(index[i],nums[i]);
        }
        for (int i = 0; i < ans1.length; i++) {
            ans1[i] = ans.get(i);
        }
        return ans1;
    }
}
