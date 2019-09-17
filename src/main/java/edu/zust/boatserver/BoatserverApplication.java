package edu.zust.boatserver;

import edu.zust.boatserver.dao.RepositoriesMarker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = {RepositoriesMarker.class})
public class BoatserverApplication {
    public static void main(String[] args) {
        SpringApplication.run(BoatserverApplication.class, args);
    }

}
