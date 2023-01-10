package tr.edu.medipol.ij.kisisunucusu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class KisisunucusuApplication {

	public static void main(String[] args) {
		SpringApplication.run(KisisunucusuApplication.class, args);
	}

}
