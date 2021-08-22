import java.util.Scanner;

// 1. Define two methods to print the maximum and the minimum number respectively among three numbers entered by user.
public class QueFirst {
    public static void main(String[] args) {
           Scanner input = new Scanner(System.in);
           int a = input.nextInt();
           int b = input.nextInt();
           int c = input.nextInt();
           max(a, b, c);
           min(a, b, c);
    }
    static void max(int a, int b, int c){
        int max = a;
        if (max < b && max > c) {
            max = b;
        }else if(max < c){
            max = c;
        }
        System.out.print(max +" ");
    }
    static void min(int a, int b,int c){
        int min = a;
        if(min > b && min < c){
            min = b;
        }else if(min > c){
            min = c;
        }
        System.out.print(min);
    }

}