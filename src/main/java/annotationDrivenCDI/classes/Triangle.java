package annotationDrivenCDI.classes;

import org.springframework.stereotype.Component;

@Component
public class Triangle implements Shape {

    @Override
    public double getArea() {
        return 1.5;
    }
}
