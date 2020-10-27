
import java.util.Locale;

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
        Validate validate = new Validate();
        Function example = new Function();
        Locale VN = new Locale("VN");
        Locale EN = Locale.ENGLISH;
        System.out.println("1. Vietnamese");
        System.out.println("2. English");
        System.out.println("3. Exit");
        System.out.print("Please choice one option: ");
        int choice = validate.inputIntLimit(EN, 1, 3);
        while (true) {
            switch (choice) {
                case 1:
                    example.login(VN);
                    break;
                case 2:
                    example.login(EN);
                    break;
                case 3:
                    return;
            }
        }

    }

}
