package annotationDrivenCDI.classes;

import org.springframework.stereotype.Component;

@Component
public class Circle implements Shape {

    @Override
    public double getArea() {
        return 15;
    }
}
