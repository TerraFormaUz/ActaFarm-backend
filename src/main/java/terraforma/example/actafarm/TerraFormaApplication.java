package terraforma.example.actafarm;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import terraforma.example.actafarm.config.OpenAPIConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableJpaRepositories
@EnableAsync
@Import(OpenAPIConfiguration.class)
public class TerraFormaApplication {

	public static void main(String[] args) {
		SpringApplication.run(TerraFormaApplication.class, args);
	}

}
