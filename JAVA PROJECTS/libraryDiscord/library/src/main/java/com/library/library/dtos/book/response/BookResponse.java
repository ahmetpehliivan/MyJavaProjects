package com.library.library.dtos.book.response;

import lombok.Data;

@Data
public class BookResponse {

    private Long id;
    private String name;
    private int pageCount;
    private Long authorId;

}
