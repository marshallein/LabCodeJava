
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
public class Function {

    final Validate validate = new Validate();

    public boolean checkWordExist(HashMap<String, String> dict, String keyword) {

        for(String i : dict.keySet()){
            if(i.equalsIgnoreCase(keyword)){
                return false;
            }
        }
        return true;

    }

    public void addWord(HashMap<String, String> dict) {

        System.out.println("Enter English : ");
        String english = validate.checkInputString();

        if (!checkWordExist(dict, english)) {
            System.out.println("word entered exist!");
            if (!validate.checkInputYN()) {
                return;
            }

        }
        System.out.println("Enter Vietnam : ");
        String vietnam = validate.checkInputString();
        dict.put(english, vietnam);
        System.out.println("Add Successful!");

    }

    public void deleteWord(HashMap<String, String> dict) {

        System.out.println("Enter word to remove : ");
        String keyword = validate.checkInputString();
        dict.remove(keyword);

    }

    public void translate(HashMap<String, String> dict) {
        System.out.print("Enter english: ");
        String english = validate.checkInputString();

        for (String i : dict.keySet()) {
            if (i.equalsIgnoreCase(english)) {
                String vietnam = dict.get(i);
                System.out.println("Vietnamese: " + vietnam);
                return;
            }
        }
        
        System.out.println("Word not found!");
    }

}
