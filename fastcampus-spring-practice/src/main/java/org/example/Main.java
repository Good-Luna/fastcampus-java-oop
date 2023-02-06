package org.example;

import org.example.config.Config;
import org.example.service.SortService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {

        /*spring 적용하기*/
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        SortService sortService = context.getBean(SortService.class);
        /*MainTest  : ctrl+shift+T*/
        /*Sort<String> sort =new BubbleSort<>();*/

        System.out.println("[result]"+sortService.doSort(Arrays.asList(args)));

    }
}