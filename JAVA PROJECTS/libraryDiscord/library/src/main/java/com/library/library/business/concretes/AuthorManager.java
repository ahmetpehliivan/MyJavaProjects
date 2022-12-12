package com.library.library.business.concretes;

import com.library.library.business.abstracts.AuthorService;
import com.library.library.business.abstracts.BookService;
import com.library.library.dataAccess.AuthorRepository;
import com.library.library.dtos.author.request.AuthorRequest;
import com.library.library.dtos.author.response.AuthorListResponse;
import com.library.library.dtos.author.response.AuthorResponse;
import com.library.library.entities.Author;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class AuthorManager implements AuthorService {

    AuthorRepository authorRepository;

    public AuthorManager(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public List<AuthorListResponse> getAll() {
        return authorRepository.findAll().stream().
                map(this::toAuthorListResponse).   //map(author -> toAuthorListResponse(author))
                collect(Collectors.toList());
    }

    @Override
    public AuthorResponse getById(Long id) {
        Optional<Author> author = authorRepository.findById(id);
        return author.map(this::toAuthorResponse).orElse(null);
    }

    @Override
    public AuthorResponse add(AuthorRequest authorRequest) {
        Author author = new Author();
        author.setName(authorRequest.getName());
        return toAuthorResponse(authorRepository.save(author));
    }

    @Override
    public AuthorResponse update(Long id, Author author) {
        Optional<Author> inDbAuthor = authorRepository.findById(id);
        if (inDbAuthor.isPresent()){
            Author author1 = inDbAuthor.get();
            author1.setName(author.getName());
            return toAuthorResponse(authorRepository.save(author1));
        }
        return null;
    }

    @Override
    public void delete(Long id) {
        authorRepository.deleteById(id);
    }

    public AuthorListResponse toAuthorListResponse(Author author){
        AuthorListResponse authorListResponse = new AuthorListResponse();
        authorListResponse.setId(author.getId());
        authorListResponse.setName(author.getName());
        return authorListResponse;
    }

    public AuthorResponse toAuthorResponse(Author author){
        AuthorResponse authorResponse = new AuthorResponse();
        authorResponse.setId(author.getId());
        authorResponse.setName(author.getName());
        //authorResponse.setBookListResponseList(author.getBookList());
        return authorResponse;
    }
}
