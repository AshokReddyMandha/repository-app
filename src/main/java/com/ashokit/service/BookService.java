package com.ashokit.service;

import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.ashokit.entity.Books;
import com.ashokit.repo.BooksRepository;

@Service
public class BookService {
	private BooksRepository booksRepository;

	public BookService(BooksRepository booksRepository) {
		this.booksRepository = booksRepository;
	}
	
	public void bookSort(String column) 
	{
		
		List<Books> findAll = booksRepository.findAll(Sort.by(column).descending());
		findAll.forEach(System.out::print); // method reference
		
	}
	
	public void bookPagination(int pageSize,int  pageNo)
	{
		Page<Books> findAll = booksRepository.findAll(PageRequest.of(pageNo-1, pageSize));
		findAll.forEach(s->System.out.println(s)); // Lamba exp
	}
	
	public void bookQBE()
	{
		Books b=new Books();
		b.setBookName("One9");
		List<Books> findAll = booksRepository.findAll(Example.of(b));
		
		findAll.forEach(s->System.out.println(s)); // Lamba exp
	}
	
}
