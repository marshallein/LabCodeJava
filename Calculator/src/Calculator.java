
import java.util.Scanner;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Marshallein
 */
public class Calculator {

    Scanner sc = new Scanner(System.in);

    public double checkInputDouble() {
        while (true) {
            try {
                double result = Double.parseDouble(sc.nextLine());
                return result;

            } catch (NumberFormatException ex) {
                System.out.println("must be a number!");
            }
        }
    }

    public int checkInputIntLimit(int min, int max) {
        //loop until user input correct
        while (true) {
            try {
                int result = Integer.parseInt(sc.nextLine().trim());
                if (result < min || result > max) {
                    throw new NumberFormatException();

                }
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input number in rage [" + min + ", " + max + "]");
                System.out.print("Enter again: ");
            }
        }
    }

    public String checkInputOperator() {
        //loop until user input correct
        while (true) {
            String result = sc.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("Not empty");
            } else if (result.equalsIgnoreCase("+") || result.equalsIgnoreCase("-")
                    || result.equalsIgnoreCase("*") || result.equalsIgnoreCase("/")
                    || result.equalsIgnoreCase("^") || result.equalsIgnoreCase("=")) {
                return result;
            } else {
                System.err.println("Please input (+, -, *, /, ^)");
            }
            System.out.print("Enter again: ");
        }
    }

    public double inputnumber() {
        double number = checkInputDouble();
        return number;
    }

    public void Calculator() {
        System.out.print("Enter number: ");
        double result = checkInputDouble();

        while (true) {
            System.out.print("Enter operator: ");
            String operator = checkInputOperator();

            if (operator.equalsIgnoreCase("+")) {
                result = result + inputnumber();
            }
            if (operator.equalsIgnoreCase("-")) {
                result = result - inputnumber();
            }
            if (operator.equalsIgnoreCase("*")) {
                result = result * inputnumber();
            }

            if (operator.equalsIgnoreCase("/")) {
                double check = inputnumber();
                if(check == 0){
                    System.out.println("cant divede 0!");
                    continue;
                } else {
                   result = result / check ; 
                }
                
                
            }
            if (operator.equalsIgnoreCase("^")) {
                result = Math.pow(result, inputnumber());
            }
            if (operator.equalsIgnoreCase("=")) {
                System.out.println(result);
                return;
            }
        }

    }

    public void BMIcalculator() {
        System.out.println("height");
        double height = checkInputDouble();
        System.out.println("weight");
        double weight = checkInputDouble();
        double bmi = weight / (height * height);
        System.out.println(bmi);
        System.out.println(BMIStatus(bmi));

    }

    public String BMIStatus(double bmi) {
        if (bmi < 19) {
            return "Under-standard.";
        } else if (bmi >= 19 && bmi < 25) {
            return "Standard.";
        } else if (bmi >= 25 && bmi < 30) {
            return "Overweight.";
        } else if (bmi >= 30 && bmi < 40) {
            return "Fat-should lose weight";
        } else {
            return "Very fat - should lose weight immediately";
        }
    }

}
