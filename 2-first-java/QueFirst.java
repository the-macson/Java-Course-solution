import java.util.Scanner;

// 1. Write a program to print factorial of a number, also take input.
public class QueFirst {
    public static void main(String[] args) {
           Scanner input = new Scanner(System.in);
           int n = input.nextInt();
           int sum =1;
           for(int i = 1 ; i <= n; i++){
             sum = i*sum;
           }
           System.out.print(sum);
    }
}