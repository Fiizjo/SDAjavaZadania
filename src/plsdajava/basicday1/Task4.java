package plsdajava.basicday1;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class Task4 {
    private static final float BMI_MIN_RANGE = 18.F;
    private static final float BMI_MAX_RANGE = 24.9F;
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int height = getHeightFromUser();
        float weight = getWeightFromUser();
        float bmi = getBMI(weight,height);
        dispalyBmiResult(bmi);
    }
    private static int getHeightFromUser() {
        System.out.print("Please insert height in cm: ");
        return scanner.nextInt();

    }
    private static float getWeightFromUser() {
        System.out.print("Please insert weight in kg: ");
        return scanner.nextFloat();

    }

    private static float getBMI(float weight, int height) {
        float heightInMeter = height / 100F;
        return weight / (heightInMeter * heightInMeter);
    }

    private static void dispalyBmiResult(float bmi) {
        if (bmi >= BMI_MIN_RANGE && bmi <= BMI_MAX_RANGE) {
            System.out.println("BMI is correct :" + bmi);
        } else{
            System.out.println("BMI is not correct: " + bmi);
        }
    }



}
