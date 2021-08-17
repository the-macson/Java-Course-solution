import java.util.Scanner;

// 2. Area Of Triangle
public class QueSecond {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float base = input.nextFloat();
        float height = input.nextFloat();
        float area = (base*height)/2;
        System.out.println(area);
    }
}
