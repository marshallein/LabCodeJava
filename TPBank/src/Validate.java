
import java.util.Locale;
import java.util.ResourceBundle;
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

    final String VALID_ACCOUNTNUMBER = "^\\d{10}$";
    final String VALID_PASSWORD = "^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{7,30}$";
    final Scanner sc = new Scanner(System.in);
    final char[] chars = {'1', 'A', 'a', 'B', 'b', 'C',
        'c', '2', 'D', 'd', 'E', 'e', 'F', 'f', '3', 'G', 'g', 'H', 'h',
        'I', 'i', 'J', 'j', 'K', 'k', 'L', 'l', '4', 'M', 'm', 'N', 'n',
        'O', 'o', '5', 'P', 'p', 'Q', 'q', 'R', 'r', 'S', 's', 'T', 't',
        '6', '7', 'U', 'u', 'V', 'v', 'U', 'u', 'W', 'w', '8', 'X', 'x',
        'Y', 'y', 'Z', 'z', '9'};

    public void getWordLanguage(Locale curLocate, String key) {
        ResourceBundle words = ResourceBundle.getBundle("Languages/" + curLocate, curLocate);
        String value = words.getString(key);
        System.out.printf(value);
    }

    public int inputIntLimit(Locale locale, int min, int max) {
        while (true) {
            try {
                int result = Integer.parseInt(sc.nextLine());
                if (result < min || result > max) {
                    getWordLanguage(locale, "getInputIntLimit");
                } else {
                    return result;
                }

            } catch (NumberFormatException ex) {
                getWordLanguage(locale, "getInputIntLimit");
            }
        }
    }

    public String checkInputString(Locale locale) {
        while (true) {
            String result = sc.nextLine();
            if (result.isEmpty()) {
                getWordLanguage(locale, "getInputString");
            } else {
                return result;
            }
        }
    }

    public int checkInputAccount(Locale locale) {
        while (true) {
            String result = sc.nextLine();
            if (result.matches(VALID_ACCOUNTNUMBER)) {
                return Integer.parseInt(result);
            }
            getWordLanguage(locale, "getErrorAccountMessage");
            System.out.println("");

        }

    }

    public String checkInputPassword(Locale locale) {
        while (true) {
            String result = sc.nextLine();
            if (result.matches(VALID_PASSWORD)) {
                return result;
            } else {
                getWordLanguage(locale, "getErrorPasswordMessage");

            }
        }
    }

    public String generateCaptchaText() {
        int size = 6;
        StringBuilder sb = new StringBuilder();
        int index = 0;
        for (int i = 0; i < size; i++) {
            index = (int) (Math.random() * (chars.length - 1));
            sb.append(chars[index]);
        }
        return sb.toString();
    }

    public boolean checkCaptchaInput(Locale locale, String captcha) {
        String input = "";
        System.out.print(captcha + "  ");
        getWordLanguage(locale, "getCaptcha");
        input = checkInputString(locale).trim();
        if (input.equals(captcha)) {
            return true;
        } else {
            return false;
        }
    }

}
