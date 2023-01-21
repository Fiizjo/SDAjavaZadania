package plsdajava.basicday1;
import java.util.Scanner;
public class Task3 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int x = insertDigit();
        int y = insertDigit();
        methodForPointA(x,y);
        methodForPointB(x,y);
        methodForPointC(x,y);
        methodForPointD(x,y);

    }
    private static int insertDigit() {
        System.out.print("Podaj liczbę: ");
        return scanner.nextInt();

    }
    private static void methodForPointA(int x, int y) {
        boolean result = x > y;
        System.out.println("If x is greater than y" + result);


    }
    private static void methodForPointB(int x, int y) {
        boolean result = (x + 3) > y;
        System.out.println("If x * 3 is greater than y" + result);
    }
    private static void methodForPointC(int x, int y) {
        boolean result = (y++ < ++x) && (--x < y++);
        System.out.println("Result pointC" + result);
    }
    private static void methodForPointD(int x, int y) {
        boolean result = (x * y) % 2 == 0;
        System.out.println("Result pointD" + result);
    }


}
