import java.util.Scanner;

// 3. Take name as input and print a greeting message for that name.z
public class QueThred {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.next();
        System.out.println("Good Morning " + name );
    }
}
