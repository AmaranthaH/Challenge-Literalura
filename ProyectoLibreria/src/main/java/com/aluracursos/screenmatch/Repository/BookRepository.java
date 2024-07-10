package com.aluracursos.screenmatch.Repository;

import com.aluracursos.screenmatch.Model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface BookRepository extends JpaRepository<Book, Integer> {
    Book findBookByTitulo(String titulo);
    List<Book> findBooksByLanguage(String language);
}

