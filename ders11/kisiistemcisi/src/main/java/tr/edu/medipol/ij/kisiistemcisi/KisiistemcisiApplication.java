package tr.edu.medipol.ij.kisiistemcisi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class KisiistemcisiApplication {

	public static void main(String[] args) {
		SpringApplication.run(KisiistemcisiApplication.class, args);
	}

}
