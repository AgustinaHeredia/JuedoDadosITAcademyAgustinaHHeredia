package cat.itacademy.barcelonactiva.herediamarengo.agustina.s05.t02.n01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@Configuration
public class S05T02N01HerediaMarengoAgustinaApplication {

    public static void main(String[] args) {
        SpringApplication.run(S05T02N01HerediaMarengoAgustinaApplication.class, args);
    }

    @Configuration
    public class WebMvcConfig implements WebMvcConfigurer {

        @Override
        public void addResourceHandlers(ResourceHandlerRegistry registry) {
            registry.addResourceHandler("/**")
                    .addResourceLocations("classpath:/static/");
        }
    }
}
