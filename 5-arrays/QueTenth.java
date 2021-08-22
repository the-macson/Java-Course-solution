import java.util.Scanner;

// 10. [Check if the Sentence Is Pangram](https://leetcode.com/problems/check-if-the-sentence-is-pangram/)
public class QueTenth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String sentence = in.next();
        boolean ans = checkIfPangram(sentence);
        System.out.println(ans);
    }
    
    public static boolean checkIfPangram(String sentence) {
        int[] arr = new int[26];
        boolean ans = true;
        if (sentence.length() < 26) {
            ans = false;
            return ans;
        }
        else{
            for (int i = 0; i < sentence.length(); i++) {
               arr[(int) sentence.charAt(i)-97]++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==0) {
                ans = false;
                return ans;
            }
        }
        return ans;
    }
}
