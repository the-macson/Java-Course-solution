import java.util.Scanner;

// 7. Input a number and print all the factors of that number (use loops).
public class QueSeventh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int cont = 2; 
        while(x > 0){
            if(x%cont ==0){
                System.out.print(cont +" ");
                x = x/cont;
            }else{
                cont++;
            }
        }
    }
}
