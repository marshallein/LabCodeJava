
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
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

    final Scanner sc = new Scanner(System.in);
    final String VALID_USERNAME = "^([a-zA-Z0-9])+([\\w._\\-@]{4,})+$"; //regex check sự xuất hiện ít nhất 5 từ bỏ qua khoảng trắng từ đầu string đến cuối string
    final String VALID_PASSWORD = "^([a-zA-Z0-9])+([\\w._\\-@]{5,})+$"; //regex check sự xuất hiện ít nhất 6 từ bỏ qua khoảng trắng từ đàu string đến cuối string
//

    public int checkInputlimit(int min, int max) {
        while (true) {
            try {
                int result = Integer.parseInt(sc.nextLine().trim());
                if (result < min || result > max) {
                    throw new NumberFormatException();

                }
                return result;
            } catch (NumberFormatException ex) {
                System.err.println("Please input number in range [" + min + ", " + max + "]");
                System.err.print("Enter again : ");
            }
        }
    }
//

    public String checkInputString() {
        while (true) {
            String result = sc.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("Not empty");
                System.err.print("Enter again : ");
            } else {
                return result;
            }
        }
    }
//

    public String checkInputUsername() {
        System.out.print("Enter username : ");
        while (true) {
            String result = checkInputString().trim();
            if (result.matches(VALID_USERNAME)) {
                return result;
            } else {
                System.err.println("You must enter least at 5 character, and no space!");
                System.err.print("Enter again : ");
            }
        }
    }
//

    public String checkInputPassword() {
        System.out.println("Enter password : ");
        while (true) {
            String result = checkInputString().trim();
            if (result.matches(VALID_PASSWORD)) {
                return result;
            } else {
                System.err.println("You must enter least at 6 character, and no space!");
                System.err.print("Enter again : ");
            }

        }
    }
//

    public boolean checkUsernameExist(String username) {
        File file = new File("user.dat");

        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                String[] account = line.split(";");
                if (username.equalsIgnoreCase(account[0])) {
                    return true;
                }
            }
            br.close();
            fr.close();
            return false;

        } catch (FileNotFoundException fnf) {
            fnf.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return false;

    }

    public String getPassword(String username) {
        File file = new File("user.dat");

        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            String line;
            while ((line = br.readLine()) != null) {
                String checkPassword[] = line.split(";");
                if (username.equalsIgnoreCase(checkPassword[0])) {
                    return checkPassword[1];

                }
            }
            return null;

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return null;

    }

}
