package com.learning.core.day6;

import java.util.Date;
import java.util.Objects;
import java.util.TreeSet;

class BookClass1 implements Comparable<BookClass1> {
    private int bookId;
    private String title;
    private double price;
    private String author;
    private Date publicationDate;

    public BookClass1(int bookId, String title, double price, String author, Date publicationDate) {
        this.bookId = bookId;
        this.title = title;
        this.price = price;
        this.author = author;
        this.publicationDate = publicationDate;
    }

    @Override
    public String toString() {
        return bookId + " " + title + " $" + price + " " + author + " " + publicationDate.getDate()+"/" + publicationDate.getMonth()+"/"+publicationDate.getYear();
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookId, title, price, author, publicationDate);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        BookClass1 book = (BookClass1) obj;
        return bookId == book.bookId &&
                Double.compare(book.price, price) == 0 &&
                Objects.equals(title, book.title) &&
                Objects.equals(author, book.author) &&
                Objects.equals(publicationDate, book.publicationDate);
    }

    public int compareTo1(BookClass1 o) {
		// TODO Auto-generated method stub
		 return this.author.compareTo(o.author);
	}

	public int compareTo1(BookClass o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int compareTo(BookClass1 o) {
		// TODO Auto-generated method stub
		return 0;
	}
}



public class D06P04 {
	public static void main(String[] args)
	{
	TreeSet<BookClass1> ts = new TreeSet<>();
    
	BookClass1 b1 = new BookClass1(1001, "Python learning", 715.0, "Martin C.Brown", new Date(120, 1, 2));
    BookClass1 b2 = new BookClass1(1002, "Modern mainframe", 295.0, "Sharad", new Date(97, 4, 19));
    BookClass1 b3 = new BookClass1(1003, "Java Programming", 523.0, "Gilad Bracha", new Date(84, 10, 23));
    BookClass1 b4 = new BookClass1(1004, "Read C++", 295.0, "Henry Harvin", new Date(84, 10, 19));
    BookClass1 b5 = new BookClass1(1005, "Net Platform", 3497.0, "Mark J Price", new Date(84, 2, 6));    
    ts.add(b1);
    ts.add(b2);
    ts.add(b3);
    ts.add(b4);
    ts.add(b5);
    
    for(BookClass1 bs: ts)
    {
    
    System.out.println(ts);
    
}
	}
}
