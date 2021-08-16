import java.util.Scanner;

// 4. Write a program to input principle, time and rate (P, T, R) from user and
// find Simple Interest.

public class QueFourth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float principle = input.nextFloat();
        float time = input.nextFloat();
        float rate = input.nextFloat();
        float SimpleInterest = (principle*time*rate)/100;
        System.out.println(SimpleInterest);
    }
}
