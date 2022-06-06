package devmind.greatreadsapp.readBooks;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReadBooksRepository extends JpaRepository<ReadBooks, Long> {




}
