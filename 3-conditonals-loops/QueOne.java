import java.util.Scanner;

// 1. Area Of Circle Java Program
public class QueOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float rad = input.nextInt();
        float area = 3.14f*rad*rad;
        System.out.println(area);
    }
}
