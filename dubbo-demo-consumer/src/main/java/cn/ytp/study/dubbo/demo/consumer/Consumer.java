package cn.ytp.study.dubbo.demo.consumer;

import cn.ytp.study.dubbo.demo.api.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ytp
 * @date 2018/07/18
 */
public class Consumer {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"consumer.xml"});
        context.start();
        // Obtaining a remote service proxy
        DemoService demoService = (DemoService)context.getBean("demoService");
        // Executing remote methods
        String hello = demoService.sayHello("World");
        // Display the call result
        System.out.println(hello);
    }
}