package devmind.greatreadsapp.book;

public class BookNotFoundException extends RuntimeException {
    public BookNotFoundException(Long id) {
        super(String.format("Book with '%d' not found", id));
    }
}
