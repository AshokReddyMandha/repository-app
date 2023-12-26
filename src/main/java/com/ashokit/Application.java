package com.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ashokit.repo.BooksRepository;
import com.ashokit.service.BookService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		BookService bs = context.getBean(BookService.class);
//		//bs.bookSort("bookId");
//		bs.bookPagination(3, 1);
//		bs.bookPagination(4, 2);
//		bs.bookPagination(3, 3);
//		bs.bookPagination(3, 4);
		
		bs.bookQBE();
		
	}

}
