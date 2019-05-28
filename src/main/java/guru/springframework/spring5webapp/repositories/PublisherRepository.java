package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.model.Publisher;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
    <S extends Publisher> S save(S s);

    <S extends Publisher> Iterable<S> saveAll(Iterable<S> iterable);

    Optional<Publisher> findById(Long aLong);

    boolean existsById(Long aLong);

    Iterable<Publisher> findAll();

    Iterable<Publisher> findAllById(Iterable<Long> iterable);

    long count();

    void deleteById(Long aLong);

    void delete(Publisher publisher);

    void deleteAll(Iterable<? extends Publisher> iterable);

    void deleteAll();
}
