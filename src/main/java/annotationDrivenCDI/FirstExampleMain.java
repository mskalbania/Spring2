package annotationDrivenCDI;

import annotationDrivenCDI.classes.Shape;
import annotationDrivenCDI.classes.TestClass;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FirstExampleMain {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("annotation.xml");

        //explicate getting component
        Shape shape = context.getBean("triangle", Shape.class);
        System.out.println("Bean created " + (shape.getArea() == 1.5));

        //injections via Autowired
        TestClass testClass = context.getBean("testClass", TestClass.class);
        System.out.println("Are wired " + testClass.isWired() + "\n" + testClass.getClassesName());

        context.close();
    }
}
