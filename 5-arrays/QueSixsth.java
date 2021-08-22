import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 6. [Kids With the Greatest Number of Candies](https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/)

public class QueSixsth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] candies = new int[n];
        for (int i = 0; i < candies.length; i++) {
            candies[i] = in.nextInt();
        }
        int extraCandies = in.nextInt();
      
        List<Boolean> ans = kidsWithCandies(candies, extraCandies);
        System.out.println(ans.toString());
    }
    
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
         List<Boolean> ans = new ArrayList<>();
         int max = candies[0];
         for (int i = 1; i < candies.length; i++) {
             if (max < candies[i]) {
                 max = candies[i];
             } 
         }
         for (int i = 0; i < candies.length; i++) {
             if (candies[i] + extraCandies < max) {
                 ans.add(false);
             }
             else{
                 ans.add(true);
             }
         }
         return ans;
    }
}
