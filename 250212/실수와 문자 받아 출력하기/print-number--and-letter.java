import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String c = sc.next();
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        sc.close();

        System.out.print(c + "\n");
        System.out.printf("%.2f \n", a);
        System.out.printf("%.2f", b);
    }
}