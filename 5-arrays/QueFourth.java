// 4. [Richest Customer Wealth](https://leetcode.com/problems/richest-customer-wealth/)
import java.util.Scanner;
public class QueFourth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] nums = {
            {1,2,3,4},
            {2,3,4,5},
            {6,7,8,9}
        };
        int ans = maximumWealth(nums);
        System.out.println(ans);
    }
    
    public static int maximumWealth(int[][] accounts) {
        int ans = 0;
        int max = 0;
        for (int i = 0; i < accounts.length; i++) {
            ans = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                ans = accounts[i][j] + ans;
            }
            if (ans > max) {
                max = ans;
            }
        }
        return max;
    }
}
