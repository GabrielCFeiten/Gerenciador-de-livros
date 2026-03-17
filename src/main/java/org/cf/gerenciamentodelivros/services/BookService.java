package org.cf.gerenciamentodelivros.services;

import org.cf.gerenciamentodelivros.models.BookModel;
import org.cf.gerenciamentodelivros.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public BookModel save(BookModel bookModel) {
        return bookRepository.save(bookModel);
    }

    public List<BookModel> findAll(){
        return bookRepository.findAll();
    }

    public void delete(Long id) {
        bookRepository.deleteById(id);
    }

    public BookModel update(Long id, BookModel bookModel) {
        Optional<BookModel> bookSearch = bookRepository.findById(id);

        if(bookSearch.isPresent()){
            BookModel bookExistente = bookSearch.get();

            bookExistente.setAutor(bookModel.getAutor());
            bookExistente.setAnoPublicacao(bookModel.getAnoPublicacao());
            bookExistente.setTituloLivro(bookModel.getTituloLivro());
            return bookRepository.save(bookExistente);
        }
        return null;
    }

}
