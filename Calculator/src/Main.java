

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Marshallein
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Calculator cal = new Calculator();
        boolean flags = true;

        while (flags) {
            int choice = cal.checkInputIntLimit(1, 3);
            switch (choice) {
                case 1:

                    cal.Calculator();
                    break;
                case 2:

                    cal.BMIcalculator();
                    break;
                case 3:;
                    flags = false;
                default:

            }

        }

    }

}
