package javaCodeDrivenCDI;

import annotationDrivenCDI.classes.Shape;
import annotationDrivenCDI.classes.Triangle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("javaCodeDrivenCDI.classes") //when using my own classes
public class AppConfiguration {

    //Used when no access to legacy code or lib classes
    @Bean
    public Shape triangle() { //bean id == method name
        return new Triangle();
    }
}
