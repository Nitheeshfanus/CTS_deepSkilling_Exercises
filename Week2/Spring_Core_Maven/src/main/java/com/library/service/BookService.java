package com.library.service;

import com.library.repository.BookRepository;

public class BookService {

    private BookRepository bookRepository;

    public void setBookRepository(BookRepository bookRepository) {
        System.out.println("Spring called setBookRepository()");
        this.bookRepository = bookRepository;
    }

    public void displayService() {
        System.out.println("Book Service Created");
        bookRepository.displayRepository();
    }
}