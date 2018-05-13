package iocANDcdiXMLbased;

import iocANDcdiXMLbased.classes.Prototype;
import iocANDcdiXMLbased.classes.Singleton;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SingletonMainExample {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("scopeContext.xml");

        Singleton singleton1 = context.getBean("singleton", Singleton.class);
        Singleton singleton2 = context.getBean("singleton", Singleton.class);

        Prototype prototype1 = context.getBean("prototype", Prototype.class);
        Prototype prototype2 = context.getBean("prototype", Prototype.class);

        System.out.println("Singleton refs should be the same: " + singleton1.equals(singleton2));
        System.out.println("Prototype refs should be different: " + !prototype1.equals(prototype2));

        context.close();
    }
}
