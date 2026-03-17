package org.cf.gerenciamentodelivros.controllers;

import org.cf.gerenciamentodelivros.models.BookModel;
import org.cf.gerenciamentodelivros.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/livros")
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping
    public ResponseEntity<List<BookModel>> getAllBooks() {
        List<BookModel> request = bookService.findAll();
        return ResponseEntity.ok(request);
    }

    @PostMapping
    public ResponseEntity<BookModel> createBook(@RequestBody BookModel book) {
        BookModel request = bookService.save(book);
        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(book.getId())
                .toUri();
        return  ResponseEntity.ok(request);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteBook(@PathVariable Long id) {
        bookService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateBook(@PathVariable Long id, @RequestBody BookModel book) {
        bookService.update(id, book);
        return ResponseEntity.noContent().build();
    }
}
