package annotationDrivenCDI.classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TestClass {

    private Shape constructorShape;
    private Shape setterShape;

    @Autowired
    @Qualifier("rectangle")
    private Shape fieldShape;

    @Autowired
    public TestClass(@Qualifier("triangle") Shape constructorShape) {
        this.constructorShape = constructorShape;
    }

    @Autowired
    public void setSetterShape(@Qualifier("circle") Shape shape) {
        this.setterShape = shape;
    }

    public boolean isWired() {
        return constructorShape != null && setterShape != null;
    }

    public String getClassesName() {
        return "Constructor injected " + constructorShape.getClass() +
                "\nSetter injected " + setterShape.getClass() +
                "\nField injected " + fieldShape.getClass();
    }
}
