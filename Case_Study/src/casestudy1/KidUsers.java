package casestudy1;
import java.lang.Exception;

class AgeRestrictionException extends Exception{ //AgeRestrictionException
	public AgeRestrictionException(String message) {
		super(message);
	}
}
class BookTypeException extends Exception{ //BookTypeexception
	public BookTypeException(String message) {
		super(message);
	}
}
public class KidUsers implements LibraryUser{
	private int age;
	private String bookType;
	@Override
	public void register_Acc(int age) throws AgeRestrictionException {
		this.age =age;
		if (age<12) 
		{
			System.out.println("You have successfully registered under a Kids Account");
		}
		else 
		{
			throw new AgeRestrictionException("Sorry, Age must be less than 12 to register as a kid");
		}
	}
	@Override
	public void requestBook(String bookType) throws BookTypeException {
		this.bookType = bookType;
		if (bookType.equals("Kids"))
		{
			System.out.println("Book issued successfully,please return the book within 10 days");
	    }
		else 
		{
			throw new BookTypeException("Oops, you are allowed to take only kids books");
		}
	}
}
