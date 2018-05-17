package Book;
/**
 * @author Sruthi Danda
 * Date: 05/16/2018
 *
 */
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

	@Autowired
	private BookService bookservice;
	
    @RequestMapping(value = "/getBooks" , method= RequestMethod.GET)
    public List<Book> getBooks(HttpServletRequest request) {
       List<Book> books = bookservice.getBooks();
       return books;
    }
    
    @RequestMapping(value = "/getBooksByAuthor", method= RequestMethod.GET)
    public List<Book> getBooksByAuthor(HttpServletRequest request){
    	List<Book> books = bookservice.getBooksByAuthor();
        return books;
    }
    
    @RequestMapping(value = "/searchBooksByAuthor/{author}", method= RequestMethod.GET)
    public List<Book> searchBooksByAuthor(@PathVariable String author, HttpServletRequest request){
    	List<Book> books = bookservice.searchBooksByAuthor(author);
        return books;
    }
    
    @RequestMapping(value = "/searchBooksByTitle/{title}", method= RequestMethod.GET)
    public List<Book> searchBooksByTitle(@PathVariable String title, HttpServletRequest request){
    	List<Book> books = bookservice.searchByTitle(title);
        return books;
    }
    
    @RequestMapping(value = "/addBook", method= RequestMethod.POST)
    public List<Book> addBook(@RequestBody Book book, HttpServletRequest request){
    	List<Book> books = bookservice.addBook(book);
        return books;
    }
}
