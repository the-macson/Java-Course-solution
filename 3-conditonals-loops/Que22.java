import java.util.Scanner;

// 22. [Subtract the Product and Sum of Digits of an Integer](https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/)
public class Que22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int sum =0;
        int mul = 1;
        while (n>0) {
            int rem = n%10;
            sum = sum + rem;
            mul = mul*rem;
            n = n/10;
        }
        int diff = mul - sum ;
        System.out.print(diff);
    }
}
