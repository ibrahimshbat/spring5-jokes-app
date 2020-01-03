package guru.springframework.joke.services;

import java.util.Set;

public interface CrudServices<T, ID> {
    Set<T> findAll();

    T findByID(ID id);

    T save(T object);

    void delete(T object);

    void deleteByID(ID id);
}
