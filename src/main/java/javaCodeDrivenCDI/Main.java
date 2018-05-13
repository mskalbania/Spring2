package javaCodeDrivenCDI;

import annotationDrivenCDI.classes.Shape;
import annotationDrivenCDI.classes.TestClass;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfiguration.class);

        Shape shape = context.getBean("triangle", Shape.class);
        System.out.println("Is created " + (shape.getArea() == 1.5));

        TestClass testClass = context.getBean("testClass", TestClass.class);
        System.out.println(testClass.getClassesName());
    }
}
