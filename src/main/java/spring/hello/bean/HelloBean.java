package spring.hello.bean;

public class HelloBean {

    private String name1;

    void init() {
        System.out.println("hello bean init()");
        this.name1 = "name1";
    }

    void say() {
        System.out.println("hellobean");
        System.out.println("hello bean Name : " + name1);
    }

    public String getName() {
        return name1;
    }

    public void setName(String name) {
        this.name1 = name;
    }
}
