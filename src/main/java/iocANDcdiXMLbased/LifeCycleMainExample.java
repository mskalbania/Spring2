package iocANDcdiXMLbased;

import iocANDcdiXMLbased.classes.DataReader;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class LifeCycleMainExample {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("lifeCycleContext.xml");

        List<String> data = context.getBean("dataReader", DataReader.class).getData();

        data.forEach(System.out::println);

        context.close();
    }
}
