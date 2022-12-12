package com.library.library.business.concretes;

import com.library.library.business.abstracts.AuthorService;
import com.library.library.business.abstracts.BookService;
import com.library.library.core.utils.BookModel;
import com.library.library.dataAccess.BookRepository;
import com.library.library.dtos.book.request.BookRequest;
import com.library.library.dtos.book.response.BookListResponse;
import com.library.library.dtos.book.response.BookResponse;
import com.library.library.entities.Author;
import com.library.library.entities.Book;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class BookManager implements BookService {

    private final BookRepository bookRepository;
    private final AuthorService authorService;

    public BookManager(BookRepository bookRepository, AuthorService authorService) {
        this.bookRepository = bookRepository;
        this.authorService = authorService;
    }

    @Override
    public List<BookListResponse> getAll() {
        List<Book> bookList = bookRepository.findAll();
        return bookList.stream().map(BookModel::toBookListResponse).collect(Collectors.toList());
    }

    @Override
    public BookResponse getById(Long id) {
        Optional<Book> book = bookRepository.findById(id);
        return book.map(BookModel::toBookResponse).orElse(null);
    }

    @Override           //!!!Anlamaya Çalıs!!!
    public BookResponse add(BookRequest bookRequest) {
        Book book = new Book();
        book.setName(bookRequest.getName());
        book.setPageCount(bookRequest.getPageCount());
        Author author = authorService.getAuthorById(bookRequest.getAuthorId());
        if (Objects.nonNull(author)){
            book.setAuthor(author);
        }
        return BookModel.toBookResponse(bookRepository.save(book));
    }

    @Override
    public BookResponse update(Book book, Long id) {
        Optional<Book> inDbBook = bookRepository.findById(id);
        if (inDbBook.isPresent()){
            Book book1 = inDbBook.get();
            book1.setName(book.getName());
            book1.setPageCount(book.getPageCount());
            return BookModel.toBookResponse(bookRepository.save(book1));
        }
        return null;
    }

    @Override
    public void delete(Long id) {
        bookRepository.deleteById(id);
    }

    /*public BookListResponse toBookListResponse(Book book){
        BookListResponse bookListResponse = new BookListResponse();
        bookListResponse.setId(book.getId());
        bookListResponse.setName(book.getName());
        bookListResponse.setPageCount(book.getPageCount());
        return bookListResponse;
    }
    public BookResponse toBookResponse(Book book){
        BookResponse bookResponse = new BookResponse();
        bookResponse.setId(book.getId());
        bookResponse.setName(book.getName());
        bookResponse.setPageCount(book.getPageCount());
        bookResponse.setAuthorId(book.getAuthor().getId());
        return bookResponse;
    }*/
}
