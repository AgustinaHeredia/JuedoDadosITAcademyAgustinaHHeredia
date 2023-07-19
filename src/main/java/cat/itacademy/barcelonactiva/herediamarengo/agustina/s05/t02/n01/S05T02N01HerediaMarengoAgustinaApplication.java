package cat.itacademy.barcelonactiva.herediamarengo.agustina.s05.t02.n01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@ComponentScan("cat.itacademy.barcelonactiva.herediamarengo.agustina.s05.t02.n01")
@EnableAutoConfiguration
@Configuration

public class S05T02N01HerediaMarengoAgustinaApplication {

	public static void main(String[] args) {
		SpringApplication.run(S05T02N01HerediaMarengoAgustinaApplication.class, args);
	}

}
