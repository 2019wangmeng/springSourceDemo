package test;

import config.BeansConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

    @Test
    public void test1(){
       // ApplicationContext app = new ClassPathXmlApplicationContext("beans.xml");
        ApplicationContext app = new AnnotationConfigApplicationContext(BeansConfig.class);
        System.out.println(app.getBean("zhengKang"));
    }

    @Test
    public void test2(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Object zhengKang = classPathXmlApplicationContext.getBean("zhengKang");
    }

}
