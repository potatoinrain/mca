package spring.hello.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloBeanMain {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("hello/hello.xml");
        HelloBean helloBean = applicationContext.getBean("HelloBean", HelloBean.class);
        helloBean.say();
        System.out.println("main: print");
        System.out.println(helloBean.getName());
    }

}
