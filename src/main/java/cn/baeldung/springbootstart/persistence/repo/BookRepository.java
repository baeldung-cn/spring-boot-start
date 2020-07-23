package cn.baeldung.springbootstart.persistence.repo;

import cn.baeldung.springbootstart.persistence.model.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookRepository extends CrudRepository<Book, Long> {
    List<Book> findByTitle(String title);
}
