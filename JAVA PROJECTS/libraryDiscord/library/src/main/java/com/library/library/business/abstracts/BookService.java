package com.library.library.business.abstracts;

import com.library.library.dtos.book.request.BookRequest;
import com.library.library.dtos.book.response.BookListResponse;
import com.library.library.dtos.book.response.BookResponse;
import com.library.library.entities.Book;

import java.util.List;

public interface BookService {

    List<BookListResponse> getAll();
    BookResponse getById(Long id);
    BookResponse add(BookRequest bookRequest);
    BookResponse update(Book book, Long id);
    void delete(Long id);

}
