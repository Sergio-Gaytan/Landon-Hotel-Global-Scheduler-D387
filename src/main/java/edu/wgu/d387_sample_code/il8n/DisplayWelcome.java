package edu.wgu.d387_sample_code.il8n;


import java.util.Locale;
import java.util.ResourceBundle;


public class DisplayWelcome implements Runnable {
   Locale locale;
    public DisplayWelcome(Locale locale) {
        this.locale = locale;
    }
    public String getWelcomeMessage() {
        ResourceBundle bundle = ResourceBundle.getBundle("translation", locale);
        return bundle.getString("welcome");
    }
    @Override
    public void run() {

    }
}
