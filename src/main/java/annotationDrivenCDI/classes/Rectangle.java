package annotationDrivenCDI.classes;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Rectangle implements Shape {

    @PostConstruct
    public void postConstruct() {
        System.out.println("IN POST CONSTRUCT");
    }

    @Override
    public double getArea() {
        return 10;
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("IN PRE DESTROY");
    }
}
