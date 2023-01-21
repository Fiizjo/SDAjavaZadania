package plsdajava.basicday1;

public class Task5 {
    public static void main(String[] args) {
        int firstDigit = 4;
        int secondDigit = 11;
        int result = sum(firstDigit, secondDigit);
        System.out.println("Result: " + result);
    }
    private static int sum(int firstDigit, int secondDigit) {
        if(firstDigit > secondDigit) {  //gdyby ktoś pomylił kolejność liczb
            int tmp = secondDigit;
            secondDigit = firstDigit;
            firstDigit = tmp;
        }
        int sum = 0;
        //#1
        //for( int i = 4; i <= 11; i++)
        //for(; firstDigit <= secondDigit; i++) też jest ok

        /*for (int i = firstDigit; i <= secondDigit; i++){
            sum += i;
    }
        return sum;*/

        /*while(firstDigit<=secondDigit) {
            sum += firstDigit;
            firstDigit++;
        }
        return sum;*/

        do {
            sum += firstDigit;
            firstDigit++;
        } while (firstDigit<=secondDigit);
        return sum;
    }
}
