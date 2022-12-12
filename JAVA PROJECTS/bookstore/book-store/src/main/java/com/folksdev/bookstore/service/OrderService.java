package com.folksdev.bookstore.service;

import com.folksdev.bookstore.model.Book;
import com.folksdev.bookstore.repository.Order;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    private final BookService bookService;

    public OrderService(BookService bookService) {
        this.bookService = bookService;
    }

    public Order putAnOrder(List<String> bookIdList){
        List<Book> bookList = bookIdList.stream().map(bookId )
    }
}
