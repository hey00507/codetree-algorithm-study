import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        sc.close();

        int temp = a;
        a = b;
        b = temp;

        System.out.print(a + " " + b);

        // Please write your code here.
    }
}