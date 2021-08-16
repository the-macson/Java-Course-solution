import java.util.Scanner;
// 5. Take in two numbers and an operator (+, -, *, /) and calculate the value.
// (Use if conditions)

public class QueFifth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        char z = input.next().trim().charAt(0);
        int sum = 0 ;
        if (z == '+') {
            sum = x + y;
        } else if (z == '-') {
            sum = x - y;
        } else if (z == '*') {
            sum = x * y;
        } else if (z == '/') {
            sum = x / y;
        }
        System.out.print(sum);
    }
}
