package com.lumiradx.subscriber;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.lumiradx.subscriber" })
public class SubscriberApplication
{
    public static void main(String[] args) throws Exception
    {
        SpringApplication.run(SubscriberApplication.class, args);
    }

}



