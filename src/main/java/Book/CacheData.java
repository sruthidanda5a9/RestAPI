package Book;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sruthi Danda
 * Date: 05/16/2018
 *
 */
public class CacheData {
	public static List<Book> books = new ArrayList<Book>();
	static{
		books.add(new Book("Iain M. Banks","Consider Phlebas"));
		books.add(new Book("The Cricket on the Hearth","The Cricket on the Hearth"));
		books.add(new Book("Val McDermid","Beneath the Bleeding"));
		books.add(new Book("Aldous Huxley","Beyond the Mexique Bay"));
		books.add(new Book("Agatha Christie","Agatha Christie"));
		books.add(new Book("Ray Bradbury","I Sing the Body Electric"));
	}

}
