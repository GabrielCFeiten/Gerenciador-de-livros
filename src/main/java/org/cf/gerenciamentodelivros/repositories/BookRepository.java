package org.cf.gerenciamentodelivros.repositories;

import org.cf.gerenciamentodelivros.models.BookModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<BookModel, Long> {
}
