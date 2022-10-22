package pe.edu.pe.upcdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.pe.upcdemo.entities.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
    Book findByIsbn(String isbn);
}
