package spring.hello.bean;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloBeanNameAwareMain {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("/hello/hello.xml");
        HelloBeanNameAware helloBeanNameAware = context.getBean("HelloBeanNameAware", HelloBeanNameAware.class);
        helloBeanNameAware.printBeanName();
    }

}
