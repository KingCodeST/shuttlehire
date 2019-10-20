package za.ac.cput;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.client.RestTemplate;

@EntityScan("ac.za.cput.domain")
@EnableJpaRepositories(basePackages = "za.ac.cput.repository")
@SpringBootApplication
public class Shuttlehire {

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }


    public static void main(String[] args){
        SpringApplication.run(Shuttlehire.class,args);
    }



}
