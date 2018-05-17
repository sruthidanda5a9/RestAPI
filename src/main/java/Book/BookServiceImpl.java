package Book;
/**
 * @author Sruthi Danda
 * Date: 05/16/2018
 *
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService{

	@Override
	public List<Book> getBooks() {
		List<Book> books = getAllBooks();
		return books;
	}
	
	@Override
	public List<Book> getBooksByAuthor() {
		List<Book> books = getAllBooks();
		Collections.sort(books, new BooksByAuthor());
		return books;
	}
	
	@Override
	public List<Book> searchByTitle(String title) {
		List<Book> books = getAllBooks();
		List<Book> searchByTitle = new ArrayList<Book>();
		if (books != null && books.size() > 0)
		{
			for (Book book: books){
				/* This can be searched with regular expressions as well.*/
				if (book.getTitle().toLowerCase().contains(title.toLowerCase()))
					searchByTitle.add(book);
			}
		}
		return searchByTitle;
	}
	
	@Override
	public List<Book> searchBooksByAuthor(String author) {
		List<Book> books = getAllBooks();
		List<Book> searchByAuthor = new ArrayList<Book>();
		if (books != null && books.size() > 0)
		{
			for (Book book: books){
				if (book.getAuthor().equalsIgnoreCase(author))
					searchByAuthor.add(book);
			}
		}
		return searchByAuthor;
	}

	@Override
	public List<Book> addBook(Book book) {
		List<Book> books = getAllBooks();
		books.add(book);
		return books;
	}
	
	public List<Book> getAllBooks()
	{
		return CacheData.books;
	}
}
