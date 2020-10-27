
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
public class Function {

    final Validate validate = new Validate();

    public void login(Locale locale) {
        validate.getWordLanguage(locale, "getAccountNumber");
        int account = validate.checkInputAccount(locale);
        validate.getWordLanguage(locale, "getPassword");
        String password = validate.checkInputPassword(locale);

        while (true) {
            String captcha = validate.generateCaptchaText();
            if (validate.checkCaptchaInput(locale, captcha)) {
                validate.getWordLanguage(locale, "getLoginSuccess");
                System.out.println("");
                return;
            } else {
                validate.getWordLanguage(locale, "getErrorCaptchaMessage");
                System.out.println("");
            }
        }

    }

}
