package casestudy1;

public interface LibraryUser {
	void register_Acc(int age) throws AgeRestrictionException;
	void requestBook(String bookType) throws BookTypeException;
}
