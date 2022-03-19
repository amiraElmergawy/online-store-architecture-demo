package gov.iti.jets.business.daos;

import java.util.Collection;
import java.util.Optional;

public interface MainDao<T> {//CRUDDao
    Optional<T> get(int id);
    Collection<T> getAll();
    int save(T t);
    void update(T t);
    void delete(T t);
}
