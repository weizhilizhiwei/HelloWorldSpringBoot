package com.lizw.test;

import com.lizw.cn.ws.TestService;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;
import org.junit.Test;

public class WebServiceTest {
    @Test
    public void testSend1() {

        // 创建动态客户端
        JaxWsDynamicClientFactory dcf = JaxWsDynamicClientFactory.newInstance();
        Client client = dcf.createClient("http://localhost:8080/services/TestService?wsdl");

        // 需要密码的情况需要加上用户名和密码
        // client.getOutInterceptors().add(new ClientLoginInterceptor(USER_NAME,PASS_WORD));
        Object[] objects = new Object[0];
        try {

            // invoke("方法名",参数1,参数2,参数3....);
            objects = client.invoke("sendMessage", "李志伟");
            System.out.println("返回数据:" + objects[0]);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }


    @Test
    public void testSend11() {

        // 创建动态客户端
        JaxWsDynamicClientFactory dcf = JaxWsDynamicClientFactory.newInstance();
        Client client = dcf.createClient("http://localhost:8080/services/TestService?wsdl");

        // 需要密码的情况需要加上用户名和密码
        // client.getOutInterceptors().add(new ClientLoginInterceptor(USER_NAME,PASS_WORD));
        Object[] objects = new Object[0];
        try {

            // invoke("方法名",参数1,参数2,参数3....);
            objects = client.invoke("sayHello", "李志伟");
            System.out.println("返回数据:" + objects[0]);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testSend2() {
        try {
            // 接口地址
            String address = "http://116.24.226.211:8080/services/TestService?wsdl";
            // 代理工厂
            JaxWsProxyFactoryBean jaxWsProxyFactoryBean = new JaxWsProxyFactoryBean();
            // 设置代理地址
            jaxWsProxyFactoryBean.setAddress(address);
            // 设置接口类型
            jaxWsProxyFactoryBean.setServiceClass(TestService.class);
            // 创建一个代理接口实现
            TestService us = (TestService) jaxWsProxyFactoryBean.create();
            // 数据准备
            String userName = "Troy Li";
            // 调用代理接口的方法调用并返回结果
            String result = us.sendMessage(userName);
            System.out.println("返回结果:" + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
