import java.util.Scanner;

// 2. Write a program to print whether a number is even or odd, also take input.
public class QueSecond {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n%2 == 0) {
            System.out.println("Number is even");   
        }
        else{
            System.out.println("Number is Odd");
        }
    }
}
