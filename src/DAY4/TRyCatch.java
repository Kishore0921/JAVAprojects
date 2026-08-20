package DAY4;
import java.util.Scanner;
public class TRyCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter numerator");
            int num = sc.nextInt();
            System.out.println("Enter denominator");
            int den = sc.nextInt();
            int res = num/den;
            System.out.println("Result is "+res);
        }catch (ArithmeticException e){
            System.out.println("Zero division error");x
        }

    }
}
