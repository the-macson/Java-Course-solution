import java.util.Scanner;

// 8. Input currency in rupee and output in dollar.
public class QueEight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float x = input.nextFloat();
        float dol = x*(0.013f);
        System.out.print(dol);
    }
}
