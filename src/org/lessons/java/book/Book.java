package org.lessons.java.book;

public class Book {

	private String title;
	private int nPage;
	private String author;
	private String publisher;
	
	public Book(String title, int nPage, String author, String publisher) throws Exception {
		
		setTitle(title);
		setnPage(nPage);
		setAuthor(author);
		setPublisher(publisher);
		
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) throws Exception {
		
		if (title.isEmpty()) {
			throw new Exception("title can't be empty");
		}
		
		this.title = title;
	}

	public int getnPage() {
		return nPage;
	}

	public void setnPage(int nPage) throws Exception {
		
		if (nPage <= 0) {
			throw new Exception ("The number of pages can't be 0 or lower");
		}
		
		this.nPage = nPage;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) throws Exception {
		
		if (author.isEmpty()) {
			throw new Exception("author can't be empty");
		}
		
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) throws Exception {
		
		if (publisher.isEmpty()) {
			throw new Exception("publisher can't be empty");
		}
		
		this.publisher = publisher;
	}
	
	@Override
	public String toString() {
		
		return "titolo: " + getTitle() + "\n"
				+"numero pagine: " + getnPage() + "\n"
				+"autore: " + getAuthor() + "\n"
				+"editore: " + getPublisher() + "\n"
				+"----------\n"; 
	}
	
	
}
