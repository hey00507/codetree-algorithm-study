import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.printf("%d \n", a+b+c);

        int f =(a+b+c)/3;
        System.out.printf("%d \n", f);

        System.out.printf("%d", a+b+c - f);
    }
}