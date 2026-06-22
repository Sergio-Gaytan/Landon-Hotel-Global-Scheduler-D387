package edu.wgu.d387_sample_code;

import edu.wgu.d387_sample_code.il8n.DisplayWelcome;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.Locale;

@SpringBootApplication
public class D387SampleCodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(D387SampleCodeApplication.class, args);

        //Thread for English
        DisplayWelcome displayWelcomeEn = new DisplayWelcome(Locale.US);
        Thread enWelcome = new Thread(displayWelcomeEn);
        enWelcome.start();

        //Thread for French
        DisplayWelcome displayWelcomeFn = new DisplayWelcome((Locale.CANADA_FRENCH));
        Thread fnWelcome = new Thread(displayWelcomeFn);
        fnWelcome.start();
	}
}
