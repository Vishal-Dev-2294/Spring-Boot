package net.engineeringdigest.journalApp;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class Vishal {
    @GetMapping("/")
    public String home() {
        return "App is running";
    }
}
