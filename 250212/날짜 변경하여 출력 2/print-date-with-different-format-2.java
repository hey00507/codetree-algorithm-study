import java.util.Scanner;

public class Main {
    public static void main (String args[]) {
        Scanner scanner = new Scanner(System.in);

        String time = scanner.next();
        String[] parts = time.split("-");
        int month = Integer.parseInt(parts[0]);
        int day = Integer.parseInt(parts[1]);
        int year = Integer.parseInt(parts[2]);

        System.out.println(year + "." + month + "."+ day);
    }
}