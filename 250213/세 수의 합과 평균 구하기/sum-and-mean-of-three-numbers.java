import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        double a = sc.nextInt();
        double b = sc.nextInt();
        double c = sc.nextInt();

        System.out.printf("%.0f \n", a+b+c);
        System.out.printf("%.0f", (a+b+c)/3);
        
    }
}