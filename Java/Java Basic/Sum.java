
import java.util.Scanner;

class Sum {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        {
            int a, b, c;

            System.out.println("enter two number");
            a = s.nextInt();
            b = s.nextInt();
            c = a + b;

            System.out.println("sum is " + c);
            s.close();
        }
    }
}
