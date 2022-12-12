package com.folksdev.bookstore.model;
/*
*       Burada bir data oluşturduk ve bu datayı repository de işleyeceğiz.
*
*
* */

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Data
@Getter
@Setter
public class Book {

    @Id                                                 //ID nin primary key olduğunu belirtir.
    @GeneratedValue(strategy = GenerationType.AUTO)     //auto da 1 den başlayacak.
    private Integer id;

    private String name;
    private String author;
    private Double price;
    private Integer stock;
}
