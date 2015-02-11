
package org.david.dubbo.service.impl;


import org.david.dubbo.service.HelloService;

/**
 * @author david
 * @date 2015.2.10
 */
public class HelloServiceImpl implements HelloService {


    /**
     * 暴露的接口
     *
     * @param name
     * @return
     */
    @Override
    public String sayHello(String name) {
        System.out.println("call sayHello");
        return "Hello " + name;
    }
}
