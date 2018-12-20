package be.intecbrussel;

import be.intecbrussel.model.Mountain;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@SpringBootApplication
public class DemoApplication {
    private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);
    private static final String URL = "http://localhost:8098/mountains";

    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<List<Mountain>> response = restTemplate.exchange(
                URL,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Mountain>>(){});
        List<Mountain> mountains = response.getBody();
        log.info(mountains.toString());
        mountains.forEach(System.out::println);
    }
//    public static void main(String args[]) {
//        SpringApplication.run(DemoApplication.class);
//    }
//
//    @Bean
//    public RestTemplate restTemplate(RestTemplateBuilder builder) {
//        return builder.build();
//    }
//
//    @Bean
//    public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
//        return args -> {
//            Mountain mountain = restTemplate.getForObject(
//                    "http://localhost:8098/mountains", Mountain.class);
//            log.info(mountain.toString());
//        };
//    }
}

