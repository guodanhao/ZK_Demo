package service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by muxi on 2017/2/15.
 */
public class RunMachine {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        ApplicationListener listener = new ApplicationListener() {

            public void onApplicationEvent(ApplicationEvent applicationEvent) {

            }
        };

        ApplicationContextAware applicationContextAware;

        Handler handler = context.getBean(Handler.class);

        handler.process();
    }
}
