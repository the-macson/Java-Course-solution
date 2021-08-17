// 4. Area Of Isosceles Triangle 
import java.util.Scanner;
public class QueFourth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float base = input.nextFloat();
        float height = input.nextFloat();
        float area = (base*height)/2;
        System.out.println(area);
    }
}
