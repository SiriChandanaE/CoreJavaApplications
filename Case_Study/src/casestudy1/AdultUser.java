package casestudy1;

public class AdultUser implements LibraryUser{
	private int age;
	private String bookType;
	@Override
	public void register_Acc(int age) throws AgeRestrictionException {
		this.age =age;
		if (age>12) 
		{
			System.out.println("You have successfully registered under a Adult Account");
		}
		else 
		{
			throw new AgeRestrictionException("Sorry, Age must be greater than 12 to register as a adult");
		}
		
	}

	@Override
	public void requestBook(String bookType) throws BookTypeException {
		this.bookType = bookType;
		if (bookType.equals("Fiction"))
		{
			System.out.println("Book issued successfully,please return the book within 7 days");
	    }
		else 
		{
			throw new BookTypeException("Oops, you are allowed to take only adult fiction books");
		}
		
	}
	
}