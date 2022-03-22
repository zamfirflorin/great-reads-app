package devmind.greatreadsapp;

import devmind.greatreadsapp.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class GreatReadsApplication {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        System.out.println("Hello World");
    }

}
