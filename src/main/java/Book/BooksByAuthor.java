package Book;
/**
 * @author Sruthi Danda
 * Date: 05/16/2018
 *
 */
import java.util.Comparator;

public class BooksByAuthor implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {
		return o1.getAuthor().compareTo(o2.getAuthor());
	}
}
