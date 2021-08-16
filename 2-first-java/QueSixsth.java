import java.security.Principal;
import java.util.Scanner;

// 6. Take 2 numbers as input and print the largest number.
public class QueSixsth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        if (x > y) {
           System.out.println(x);
        }else{
            System.out.println(y);
        }
    }
}
