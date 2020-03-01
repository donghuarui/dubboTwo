package org.dhr.model.server;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * DubboConsumerApplication
 * 消费者启动类
 *
 * @author xiaoze
 * @date 2018/6/7
 */
@EnableDubbo(scanBasePackages = "org.dhr.model.server.controller")
@SpringBootApplication
public class DubboConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboConsumerApplication.class, args);
    }
}
