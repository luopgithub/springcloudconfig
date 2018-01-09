/** 
 * Title: Application.java 
 * Package: com.recon.configserver 
 * Copyright(C) 2018 All rights Reserved, Designed By Recon Innovation Group    
 * Author: huanghui  
 * CreateDate: 2018年1月4日 下午2:17:57 
 * Version: v1.0  
 */
package com.recon.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 
 * spring cloud config 服务端启动器，用于读取统一云配置
 * 当前版本支持git和svn，可根据applicaiton配置文件进行调整
 * 
 * @Author huanghui
 * @CreateDate 2018年1月4日
 * @Version v1.0
 */
@SpringBootApplication
@EnableConfigServer
public class Application
{

    /**
     * <Description>
     * 
     * @author huanghui
     * @param args
     */
    public static void main(String[] args)
    {
        SpringApplication.run(Application.class, args);
    }

}
