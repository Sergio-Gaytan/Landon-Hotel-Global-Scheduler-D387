package edu.wgu.d387_sample_code.il8n;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Locale;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
public class WelcomeController {

    @GetMapping("/welcome")
    public ResponseEntity<String> showWelcome (@RequestParam("lang") String lang ) {
        Locale locale = Locale.forLanguageTag(lang);
        DisplayWelcome message = new DisplayWelcome(locale);
        return new ResponseEntity<> (message.getWelcomeMessage(), HttpStatus.OK);
    }
}
