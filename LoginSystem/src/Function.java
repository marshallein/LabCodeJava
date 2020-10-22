/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Marshallein
 */
public class Function {

    final Validate validate = new Validate();

    public int menu() {
        System.out.println("1. Create a new account.");
        System.out.println("2. Login system.");
        System.out.println("3. Exit.");
        System.out.print("Enter your choice: ");
        int choice = validate.checkInputlimit(1, 3);
        return choice;
    }

    public void writeAccountToFile(String account, String password) {
        File file = new File("user.dat");
        try {
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write(account + ";" + password + "\n");
            bw.close();
            fw.close();
            System.out.println("Add Success!");

        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    public void createAccount() {
        String username = validate.checkInputUsername();
        if (validate.checkUsernameExist(username)) {
            System.out.println("Username Exist!");
            return;
        }
        String password = validate.checkInputPassword();

        writeAccountToFile(username, password);
        System.out.println("Create Successful ! ");

    }

    public void loginSystem() {
        System.out.println("Login System");

        String username = validate.checkInputUsername();
        String password = validate.checkInputPassword();

        if (validate.checkUsernameExist(username)) {
            if (password.equalsIgnoreCase(validate.getPassword(username))) {
                System.out.println("Login success!");
            } else {
                System.out.println("Login unsuccess!");

            }

        }

    }

}
