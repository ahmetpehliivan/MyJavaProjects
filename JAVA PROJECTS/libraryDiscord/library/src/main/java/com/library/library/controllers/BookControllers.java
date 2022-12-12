package com.library.library.controllers;

import com.library.library.business.abstracts.BookService;
import com.library.library.dtos.book.request.BookRequest;
import com.library.library.dtos.book.response.BookListResponse;
import com.library.library.dtos.book.response.BookResponse;
import com.library.library.entities.Book;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/api/v1/book")
public class BookControllers {

    AuthorController authorController;
    BookService bookService;

    public BookControllers(AuthorController authorController, BookService bookService) {
        this.authorController = authorController;
        this.bookService = bookService;
    }

    @GetMapping
    public ResponseEntity<List<BookListResponse>> getAll(){
        List<BookListResponse> bookList = bookService.getAll();
        if (bookList.isEmpty()){
            return ResponseEntity.noContent().build();
        }
        return new ResponseEntity<>(bookList, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<BookResponse> getById(@PathVariable long id){
        BookResponse book = bookService.getById(id);
        if (Objects.nonNull(book)){
            return new ResponseEntity<>(book, HttpStatus.OK);
        }
        return ResponseEntity.badRequest().build();
    }

    @PostMapping
    public ResponseEntity<BookResponse> addBook(@RequestBody BookRequest bookRequest){
        BookResponse book1 = bookService.add(bookRequest);
        if (Objects.nonNull(book1)){
            return new ResponseEntity<>(book1,HttpStatus.OK);
        }
        return ResponseEntity.badRequest().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<BookResponse> updateBook(@PathVariable Long id, @RequestBody Book book){
        BookResponse book1 = bookService.update(book,id);
        if (Objects.nonNull(book1)){
            return new ResponseEntity<>(book1, HttpStatus.OK);
        }
        return ResponseEntity.badRequest().build();
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable long id){
        bookService.delete(id);
    }


}
