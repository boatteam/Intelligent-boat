package edu.zust.boatserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class BoatserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(BoatserverApplication.class, args);
    }

}
