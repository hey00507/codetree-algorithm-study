import java.util.Scanner;

public class Main {
    public static void main (String args[]) {
        Scanner scanner = new Scanner(System.in);

        String time = scanner.next();
        String[] parts = time.split("-");
        String front = parts[0];
        String back = parts[1];

        System.out.println(front + back);
    }
}