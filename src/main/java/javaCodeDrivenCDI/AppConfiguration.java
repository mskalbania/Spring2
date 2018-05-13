package javaCodeDrivenCDI;

import annotationDrivenCDI.classes.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.lang.reflect.Field;

@Configuration
@ComponentScan("javaCodeDrivenCDI.classes") //when using my own classes
public class AppConfiguration {

    //Used when no access to legacy code or lib classes
    @Bean
    public Shape triangle() { //bean id == method name
        return new Triangle();
    }

    @Bean
    public Shape circle() {
        return new Circle();
    }

    @Bean Shape rectangle() {
        return  new Rectangle();
    }

    @Bean
    public TestClass testClass() {
        TestClass testClass = new TestClass(triangle());
        testClass.setSetterShape(circle());
        try {
            Field f = testClass.getClass().getDeclaredField("fieldShape");
            f.setAccessible(true);
            f.set(Shape.class, rectangle());

        } catch (Exception e) {
        }
        return testClass;
    }
}
