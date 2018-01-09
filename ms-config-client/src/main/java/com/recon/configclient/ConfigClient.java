/** 
 * Title: ConfigClient.java 
 * Package: com.recon 
 * Copyright(C) 2018 All rights Reserved, Designed By Recon Innovation Group    
 * Author: huanghui  
 * CreateDate: 2018年1月2日 下午3:10:01 
 * Version: v1.0  
 */
package com.recon.configclient;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 此类只是作为配置客户端测试类使用
 * 各子系统直接引用当前client组件即可
 * 
 * @Author huanghui
 * @CreateDate 2018年1月2日
 * @Version v1.0
 */

@SpringBootApplication
public class ConfigClient
{

    /**
     * <Description>
     * 
     * @author huanghui
     * @param args
     */

    @Value("${spring.datasource.driverClassName}")
    private String driverClassName;

    @Value("${spring.datasource.username}")
    private String user;

    @Value("${spring.datasource.password}")
    private String password;

    @Value("${spring.datasource.url}")
    private String url;
    

    @PostConstruct
    public void show()
    {
        System.out.println("driverClassName=" + driverClassName);
        System.out.println("user=" + user);
        System.out.println("password=" + password);
        System.out.println("url=" + url);
    }

    public static void main(String[] args)
    {
        SpringApplication.run(ConfigClient.class, args);
    }

}
