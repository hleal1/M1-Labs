package Lab10;

public class Book {

	public int numberOfAuthors;
	public	Publisher publisherName;
	public String bookTitle;
	public	int numberOfPages;
	public int publicationYear;
	public Author[] author;

	public Book(int numberOfAuthors, Publisher pName, String title, int numberOfPages, int publicationYear){
		author = new Author[numberOfAuthors];
		this.publisherName = pName;
		this.bookTitle = title;
		this.numberOfPages = numberOfPages;
		this.publicationYear = publicationYear;
	}

	int i = 0;

	public void addAuthor(Author authorRef)
	{
		author[i] = authorRef;
		i++;
	}

	public String printBook()
	{
		String bookInfo = ("");

		for (i=0; i < author.length ; i++)
		{
			bookInfo += author[i].lastName + ", " + author[i].firstName + " " + author[i].middleNameInital + "; ";
		}

		bookInfo += bookTitle + "; " + numberOfPages + "; " + publicationYear; 

		return bookInfo;
	}
}


