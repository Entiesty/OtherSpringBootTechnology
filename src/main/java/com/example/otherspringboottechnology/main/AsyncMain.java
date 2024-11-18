package com.example.otherspringboottechnology.main;


import com.example.otherspringboottechnology.config.AsyncConfig;
import com.example.otherspringboottechnology.service.AsyncService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class AsyncMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AsyncConfig.class);
        AsyncService service = ctx.getBean(AsyncService.class);
        System.out.println("当前线程名称【" + Thread.currentThread().getName() + "】");
        service.generateReport();
    }
}
