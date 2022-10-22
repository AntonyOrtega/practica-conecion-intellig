package pe.edu.pe.upcdemo.repository;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.pe.upcdemo.entities.Book;
import pe.edu.pe.upcdemo.entities.Page;

import java.util.List;

public interface PageRepository extends JpaRepository<Page, Long> {
    List<Page> findByBook(Book book, Sort sort);
}
