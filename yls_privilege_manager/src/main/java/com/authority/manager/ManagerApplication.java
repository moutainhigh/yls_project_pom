package com.authority.manager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.scheduling.annotation.EnableAsync;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


/**
 * 系统程序的主函数：主入口
 */
@SpringBootApplication
//@EnableDiscoveryClient //注册服务
@EnableAsync
@EnableSwagger2 //swagger2文档接口
@ServletComponentScan //自动扫描
//引入自定义的配置文件
@ImportResource(locations = {"classpath:spring-mvc.xml"})
public class ManagerApplication {

    /**
     * 功能描述:
     * 〈系统的主函数：可以携带参数〉
     * @author : yls
     * @date : 2020/07/12 10:59
     * @param args 系统执行时添加的参数数组
     * @return : void
     */
    public static void main(String[] args) {
        SpringApplication.run(ManagerApplication.class, args);
    }

}
