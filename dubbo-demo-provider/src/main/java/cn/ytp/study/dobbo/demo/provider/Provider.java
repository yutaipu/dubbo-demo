package cn.ytp.study.dobbo.demo.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ytp
 * @date 2018/07/18
 */
public class Provider {

    public static void main(String[] args) throws Exception {
        System.setProperty("java.net.preferIPv4Stack", "true");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"provider.xml"});
        System.out.println(1);
        context.start();
        System.out.println(2);
        System.out.println("Provider started.");
        System.in.read(); // press any key to exit
    }
}