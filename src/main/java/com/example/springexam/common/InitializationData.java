package com.example.springexam.common;

import com.example.springexam.domain.Book;
import com.example.springexam.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class InitializationData implements CommandLineRunner {

    private final BookRepository bookRepository;

    @Override
    public void run(String... args) throws Exception {
        for (int i = 0; i < 5; i++) {
            Book booki = new Book();
            booki.setTitle("This is title " + i);
            booki.setAuthorName("The Author " + i);
            booki.setGenre("The genre " + i);
            bookRepository.save(booki);
        }
    }
}
