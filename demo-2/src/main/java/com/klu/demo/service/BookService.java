package com.klu.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klu.demo.entity.Book;
import com.klu.demo.repository.BookRepository;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public Book addBook(Book book) {
        return bookRepository.save(book);
    }


    public Book getBook(int bookId) {
        return bookRepository.findById(bookId).orElse(null);
    }

    public List<Book> listBooks() {
        return bookRepository.findAll();
    }
}