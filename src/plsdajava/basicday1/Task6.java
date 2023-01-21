package plsdajava.basicday1;

public class Task6 {
    public static void main(String[] args) {
        //printMultiTable();
        printMutltiTable(6,2,5);

    }
    private static void printMultiTable() {
        for (int i = 1; i <= 4; i++) {
            System.out.println("5 x " + i + "=" + (5 * i));
        }
    }
    private static void printMutltiTable(int multiplier, int minMultiplicand, int maxMultiplicand) {
        for(int i = minMultiplicand; i<= maxMultiplicand; i++){
            int result = multiplier * i;
            System.out.println(multiplier+ "x" + i + "=" + result);
        }
    }

}
/*

    private static int multi(int a, int b) {
        while (b <= 4) {
            System.out.println();
            b++;
        }
    }
}*/
