import java.util.Scanner;

// 10. Take integer inputs till the user enters 0 and print the largest number from all.
public class QueTenth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max = 0;
        while (true) {
            int n = input.nextInt();
            if(n > max){
                max = n;
            }
            if (n == 0) {
                break;
            }
        }
        System.out.println(max);
    }
}
