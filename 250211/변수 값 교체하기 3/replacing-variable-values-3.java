public class Main {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int temp = a;

        a = b;
        b = temp;
        
        System.out.print(a + "\n");
        System.out.print(b);
    }
}