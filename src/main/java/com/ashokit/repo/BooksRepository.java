package com.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ashokit.entity.Books;

@Repository
public interface BooksRepository extends JpaRepository<Books, Integer>{

}
