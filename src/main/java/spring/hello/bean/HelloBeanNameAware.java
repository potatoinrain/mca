package spring.hello.bean;

import org.springframework.beans.factory.BeanNameAware;

public class HelloBeanNameAware implements BeanNameAware {

    private String beanName;
    @Override
    public void setBeanName(String s) {
        this.beanName = s;
    }


    public void printBeanName(){
        System.out.println(beanName);
    }

}
