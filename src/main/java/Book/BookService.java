package Book;
/**
 * @author Sruthi Danda
 * Date: 05/16/2018
 *
 */
import java.util.List;

public interface BookService {
	public List<Book> getBooks();
	public List<Book> getBooksByAuthor();
	public List<Book> searchBooksByAuthor(String author);
	public List<Book> searchByTitle(String title);
	public List<Book> addBook(Book book);
}
