package com.zinzza.springpractice;

import com.zinzza.springpractice.config.Config;
import com.zinzza.springpractice.service.SortService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        SortService sortService = context.getBean(SortService.class);

        System.out.println("[결과]" + sortService.doSort(Arrays.asList(args)));

    }
}
