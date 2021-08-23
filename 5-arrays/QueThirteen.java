import java.util.Scanner;

// 13. [Flipping an Image](https://leetcode.com/problems/flipping-an-image/)
public class QueThirteen {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] image = new int[n][n];
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image.length; j++) {
                image[i][j] = in.nextInt();
            }
        }
        int[][] ans = flipAndInvertImage(image);
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans.length; j++) {
                System.out.print(ans[i][j]+" ");
            }
        }
    }
    
    public static int[][] flipAndInvertImage(int[][] image) {
        int[][] ans = new int[image.length][image.length];
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans.length; j++) {
                if (image[i][ans.length-j-1] == 1) {
                    ans[i][j] = 1; 
                }
            }
        }
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans.length; j++) {
                if (ans[i][j]==0) {
                    ans[i][j] =1;
                }else{
                    ans[i][j] =0;
                }
            }
        }
        return ans;
    }
}
