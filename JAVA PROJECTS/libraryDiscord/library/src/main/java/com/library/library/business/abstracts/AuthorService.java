package com.library.library.business.abstracts;

import com.library.library.dtos.author.request.AuthorRequest;
import com.library.library.dtos.author.response.AuthorListResponse;
import com.library.library.dtos.author.response.AuthorResponse;
import com.library.library.dtos.book.response.BookListResponse;
import com.library.library.entities.Author;

import java.util.List;

public interface AuthorService {

    List<AuthorListResponse> getAll();
    AuthorResponse getById(Long id);
    AuthorResponse add(AuthorRequest authorRequest);
    AuthorResponse update(Long id,Author author);
    void delete(Long id);

    AuthorListResponse toAuthorListResponse(Author author);
    AuthorResponse toAuthorResponse(Author author);

    Author getAuthorById(Long id);
    List<BookListResponse> getAuthorBookList(Long id);
}
