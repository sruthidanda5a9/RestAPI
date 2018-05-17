package Book;
/**
 * @author Sruthi Danda
 * Date: 05/16/2018
 *
 */
import java.io.Serializable;

@SuppressWarnings("serial")
public class Book implements Serializable{

	private String author;
	private String title;
	
	public Book(){
		
	}

	public Book(String bookAuthor, String bookTitle) {
		this.author = bookAuthor;
		this.title = bookTitle;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
