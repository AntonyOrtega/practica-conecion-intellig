package pe.edu.pe.upcdemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import pe.edu.pe.upcdemo.entities.Book;
import pe.edu.pe.upcdemo.entities.Page;
import pe.edu.pe.upcdemo.repository.BookRepository;
import pe.edu.pe.upcdemo.repository.PageRepository;

@SpringBootApplication
public class UpcDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(UpcDemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner mappingDemo(
            BookRepository bookRepository,
            PageRepository pageRepository
    ){
        return args -> {
            Book book=new Book("Java 101", "Henry","123456");
            bookRepository.save(book);
            pageRepository.save(new Page(1,"Introducion contets", "intrpduction", book));
            pageRepository.save(new Page(65,"Java 17 contets", "Java 17", book));
            pageRepository.save(new Page(95,"Concurrency contets", "Concurrency", book));
            pageRepository.save(new Page(103,"Lambdas contets", "Lambdas", book));
        };
    }
}
