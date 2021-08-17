import java.util.Scanner;

// 21. Fibonacci Series In Java Programs
public class Que21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int first = 0 ;
        int sec = 1;
        System.out.print(first + " ");
        System.out.print(sec + " ");
        for(int i = 3; i <= n; i++ ){
            int bac = sec;
            sec = first + sec;
            first = bac;
            System.out.print(sec + " ");
        }
    }
}
