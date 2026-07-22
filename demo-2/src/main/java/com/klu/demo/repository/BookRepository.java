package com.klu.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.klu.demo.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {
}