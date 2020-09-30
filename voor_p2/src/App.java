//student james voor
import java.util.ArrayList;
import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        ArrayList<BodyMassIndex> bmiData = new ArrayList<>();

        while (moreInput()) {
            double height = getUserHeight();
            double weight = getUserWeight();

            BodyMassIndex bmi = new BodyMassIndex(height, weight);
            bmiData.add(bmi);

            displayBmiInfo(bmi);
        }
        displayBmiStatistics(bmiData);
    }


    public static boolean moreInput() {
        System.out.print("Type Y to enter BMI information, N exits");
        Scanner s1 = new Scanner(System.in);
        //s1.nextLine(); took this out was causing issues with failing the bool return statement??? couldn't exit while(input) main loop
        return s1.next().equals("Y");   //this does not check for null, is this dangerous to compare since s1.next is uncontrolled? heh
    }

    public static double getUserHeight() {
        Scanner s1 = new Scanner(System.in);
        double input;
        do {
            System.out.print("Please enter your height in inches");
            input = s1.nextDouble();
            s1.nextLine();
        } while(input <= 0);
        return input;
    }

    public static double getUserWeight() {
        Scanner s1 = new Scanner(System.in);
        double input;
        do {
            System.out.print("Please enter your weight in pounds");
            input = s1.nextDouble();
        } while(input <= 0);
        return input;
    }

    public static void displayBmiInfo(BodyMassIndex bmi) {
        System.out.printf("Your calculated BMI score is %.1f%%\n", bmi.calcBMI());
        System.out.print("Your calculated BMI category is ");
        switch(bmi.calcBMICategory()){
            case 1 -> System.out.print("Underweight < 18.5\n");
            case 2 -> System.out.print("Normal weight = 18.5–24.9\n");
            case 3 -> System.out.print("Overweight = 25–29.9\n");
            case 4 -> System.out.print("Obesity >= 30\n");
        }
    }

    public static void displayBmiStatistics(ArrayList<BodyMassIndex> bmiData) {
        double averageBMIScore = 0;
        for(BodyMassIndex element : bmiData) averageBMIScore += element.calcBMI();
        averageBMIScore /= bmiData.size();
        System.out.printf("The average BMI score of the session is %.1f%%", averageBMIScore);
    }
}