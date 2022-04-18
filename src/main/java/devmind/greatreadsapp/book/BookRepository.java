package devmind.greatreadsapp.book;

import devmind.greatreadsapp.InMemoryDataStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Component
public class BookRepository {

    @Autowired
    InMemoryDataStore inMemoryDataStore;

    public void create(Book book) {
        inMemoryDataStore.getBookMap().put(book.getId(), book);
    }

    public Book getBookById(Long id) {
        return inMemoryDataStore.getBookMap().get(1);
    }

    public List<Book> getAllBooks() {
       List<Book> books = new ArrayList<>();
       Map<Long, Book> bookMap = inMemoryDataStore.getBookMap();
       for (Long key : bookMap.keySet()) {
           books.add(bookMap.get(key));
       }
        return books;
    }

    public void update(Book book) {
       inMemoryDataStore.getBookMap().put(book.getId(), book);
    }

    public void delete(Long id) {
        inMemoryDataStore.getBookMap().remove(id);
    }


}
