
import java.util.HashMap;

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
    
    public static void main(String[] args) {
        HashMap<String, String> dict = new HashMap<>();
        Validate validate = new Validate();
        Function ob = new Function();
        
        while (true) {
            int choice = validate.menu();
            switch (choice) {
                case 1:
                    ob.addWord(dict);
                    break;
                case 2:
                    ob.deleteWord(dict);
                    break;
                case 3:
                    ob.translate(dict);
                    break;
                case 4:
                    return;
            }
        }
        
    }
}
