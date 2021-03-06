
import java.util.ArrayList;
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
public class Validate {

    final static Scanner sc = new Scanner(System.in);

    //
    public String checkInputString() {
        //loop until user input correct
        while (true) {
            String result = sc.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("Not empty");
                System.out.print("Enter again: ");
            } else {
                return result;
            }
        }
    }
    
    public String checkInputStringToSearch(){
        while(true){
            String result = sc.nextLine().trim();
            return result;
        }
    }

    //
    public int checkInputInt() {
        //loop until user input correct
        while (true) {
            try {
                int result = Integer.parseInt(sc.nextLine().trim());
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input number integer");
                System.out.print("Enter again: ");
            }
        }
    }

    //
    public int checkInputIntLimit(int min, int max) {
        //loop until user input correct
        while (true) {
            try {
                int result = Integer.parseInt(sc.nextLine().trim());
                if (result < min || result > max) {
                    throw new NumberFormatException();

                }
                return result;
            } catch (NumberFormatException ex) {
                System.err.println("Please input number in rage [" + min + ", " + max + "]");
                System.out.print("Enter again: ");
            }
        }
    }
    //

    public Doctor checkCodeExist(String code, ArrayList<Doctor> doc) {
        for (Doctor doctor : doc) {
            if (code.equalsIgnoreCase(doctor.getCode())) {
                return doctor;
            }
        }
        return null;
    }

    public boolean checkCodeDup(ArrayList<Doctor> doc, String code, String name, String spec, int avai) {
        for (Doctor doctor : doc) {
            if (code.equalsIgnoreCase(doctor.getCode())
                    && name.equalsIgnoreCase(doctor.getName())
                    && spec.equalsIgnoreCase(doctor.getSpecialization())
                    && (avai == doctor.getAvailability())) {
                return true;

            }

        }
        return false;

    }

}
