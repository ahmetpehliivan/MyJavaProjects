package com.folksdev.bookstore.repository;

//Bu kısım bizim uygulamamızla db arasında bir köprü oluşturacak.

import com.folksdev.bookstore.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
