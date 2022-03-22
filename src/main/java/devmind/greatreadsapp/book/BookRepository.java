package devmind.greatreadsapp.book;

import devmind.greatreadsapp.InMemoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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

    public List<Book> getAllBooks() {
       List<Book> books = new ArrayList<>();
       Map<Long, Book> bookMap = inMemoryRepository.getBookMap();
       for (Long key : bookMap.keySet()) {
           books.add(bookMap.get(key));
       }
        return books;
    }

    public void update(Book book) {
       inMemoryRepository.getBookMap().put(book.getId(), book);
    }

    public void delete(Long id) {
        inMemoryRepository.getBookMap().remove(id);
    }


}
