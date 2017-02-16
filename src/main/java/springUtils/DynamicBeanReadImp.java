package springUtils;

import bean.DynamicBean;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Created by muxi on 2017/2/15.
 */
public class DynamicBeanReadImp implements DynamicBeanReader, ApplicationContextAware{

    private XmlBeanDefinitionReader beanDefinitionReader;

    private ConfigurableApplicationContext configurableApplicationContext = null;

    // 加载Bean
    public void loadBean(DynamicBean dynamicBean) {

    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

    }
}
