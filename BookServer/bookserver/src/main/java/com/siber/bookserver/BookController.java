package com.siber.bookserver;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import com.siber.bookserver.Model.Book;

import java.util.ArrayList;
import java.util.List;


@RestController
public class BookController {


    @GetMapping("/list")
    public List<Book>getAllBooks(){

List<Book> books=new ArrayList<>();

books.add(new Book("The Lord Of The Rings","1954","J.R.R Tolkien" ));
books.add(new Book("Hobbit","1937","J.R.R Tolkien" ));
        return books;


    }
    
}
