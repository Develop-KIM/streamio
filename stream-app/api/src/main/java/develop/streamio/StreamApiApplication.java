package develop.streamio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "develop.streamio")
public class StreamApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(StreamApiApplication.class);
    }
}
