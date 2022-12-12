package com.library.library.dataAccess;

import com.library.library.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Long> {

    //boolean existsByNameIgnoreCase(String name);
}
