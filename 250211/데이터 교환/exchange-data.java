public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int c = 7;
        int temp;
        int temp2;

        // b 에는 a 값
        temp = b;
        b = a;

        // c 에는 b 값
        temp2 = c;
        c = temp;
        
        a = temp2;

        System.out.print(a + "\n");
        System.out.print(b + "\n");
        System.out.print(c);
    }
}