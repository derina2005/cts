package com.library;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.library.service.BookService;

public class MainApp {

    public static void main(String[] args) {

        System.out.println("Program Started...");

        try (ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml")) {

            System.out.println("Spring Context Loaded Successfully.");

            BookService service = context.getBean("bookService", BookService.class);

            System.out.println("BookService Bean Retrieved Successfully.");

            service.displayService();

            System.out.println("Method Executed Successfully.");
        }

        System.out.println("Program Ended.");
    }
}