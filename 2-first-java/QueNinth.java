import java.util.Scanner;
// 9. Take integer inputs till the user enters 0 and print the sum of all numbers
// (HINT: while loop)

public class QueNinth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum=0;
        while(true){
            int n = input.nextInt();
            sum = sum +n ;
            if(n == 0){
                break;
            }
        }
        System.out.println(sum);
    }
}
