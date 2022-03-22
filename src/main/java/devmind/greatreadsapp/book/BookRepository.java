package devmind.greatreadsapp.book;

import devmind.greatreadsapp.InMemoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BookRepository {

    @Autowired
    InMemoryRepository inMemoryRepository;

    public void create(Book book) {
        inMemoryRepository.getBookMap().put(book.getId(), book);
    }

    public Book getBookById(Long id) {
        return inMemoryRepository.getBookMap().get(1);
    }

    public void update(Book book) {
        Book updateBook = inMemoryRepository.getBookMap().get(book.getId());
        updateBook = book;
    }

    public void delete(Long id) {
        inMemoryRepository.getBookMap().remove(id);
    }


}
