/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marshallein
 */
public class Menu {

    Validate validate = new Validate();

    public int menu() {
        System.out.println("1. Add doctor");
        System.out.println("2. Update doctor");
        System.out.println("3. Delete doctor");
        System.out.println("4. Search doctor");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
        int choice = validate.checkInputIntLimit(1, 5);
        return choice;
    }
}
