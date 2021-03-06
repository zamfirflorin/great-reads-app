package devmind.greatreadsapp.book;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {


    Book save(Book book);

    Optional<Book> findById(Long id);

    List<Book> findAll();

    void delete(Book book);


}
