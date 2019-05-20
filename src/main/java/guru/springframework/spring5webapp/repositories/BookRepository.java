package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.model.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface BookRepository extends CrudRepository <Book, Long> {
    <S extends Book> S save(S s);

    <S extends Book> Iterable<S> saveAll(Iterable<S> iterable);

    Optional<Book> findById(Long aLong);

    boolean existsById(Long aLong);

    Iterable<Book> findAll();

    Iterable<Book> findAllById(Iterable<Long> iterable);

    long count();

    void deleteById(Long aLong);

    void delete(Book book);

    void deleteAll(Iterable<? extends Book> iterable);

    void deleteAll();
}
