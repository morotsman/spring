package com.github.morotsman.spring.spring_with_java_app;


import com.github.morotsman.spring.spring_with_java_app.service.AppService;
import javax.annotation.Resource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;


@Component("MyApp")
public class App
{
    
    @Resource
    private AppService appService;
    
    public App(){
        System.out.println("App is created.");
    }
    
    public void start(){
        System.out.println("App is started.");
        appService.helloWorld();
    }
    
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        App app = (App)context.getBean("MyApp");
        app.start();
    }
}
