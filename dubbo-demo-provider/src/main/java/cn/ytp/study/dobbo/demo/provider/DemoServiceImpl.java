package cn.ytp.study.dobbo.demo.provider;

import cn.ytp.study.dubbo.demo.api.DemoService;

/**
 * @author ytp
 * @date 2018/07/18
 */
public class DemoServiceImpl implements DemoService {

    public String sayHello(String name) {
        System.out.println(" Hello " + name);
        return "Hello";
    }
}
