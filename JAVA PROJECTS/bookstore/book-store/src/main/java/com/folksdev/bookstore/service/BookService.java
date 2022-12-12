package com.folksdev.bookstore.service;
/*
*   Verilen ID ye göre Book nesnesini veri tabanından getirmek istiyoruz.
* */


import com.folksdev.bookstore.model.Book;
import com.folksdev.bookstore.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookService {

    //Note: BookStore inject etmem gerekiyorki onu kullanabiliyim.
    //      interface ler constructer larıyla beraber gelir.
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Optional<Book> findBookById(Integer bookId){
        return bookRepository.findById(bookId);
    }
}
