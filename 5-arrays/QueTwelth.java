import java.util.Scanner;
// 12. [Find the Highest Altitude](https://leetcode.com/problems/find-the-highest-altitude/)
public class QueTwelth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] gain = new int[n];
        for (int i = 0; i < gain.length; i++) {
            gain[i] = in.nextInt();
        }
        int ans = largestAltitude(gain);
        System.out.println(ans);
    }
    
    public static int largestAltitude(int[] gain) {
        int ans = 0;
        int[] result = new int[gain.length+1];
        result[0] = 0;
        for (int i = 0; i < gain.length; i++) {
            result[i+1] = result[i] + gain[i];
        }
        for (int i = 0; i < result.length; i++) {
            if (ans < result[i]) {
                ans = result[i];
            }
        }
        return ans;
    }
}
