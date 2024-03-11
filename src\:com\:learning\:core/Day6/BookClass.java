package com.learning.core.day6;

import java.util.Date;
import java.util.Objects;

public class BookClass {
	public BookClass(int bookid, String title, double price, String author, Date dateofpub) {
		super();
		this.bookid = bookid;
		this.title = title;
		this.price = price;
		this.author = author;
		this.dateofpub = dateofpub;
	}
	private int bookid;
	   private String title;
	   private double price;
	   private String author;
	   private Date dateofpub;
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Date getDateofpub() {
		return dateofpub;
	}
	public void setDateofpub(Date dateofpub) {
		this.dateofpub = dateofpub;
	}
	@Override
	public int hashCode() {
		return Objects.hash(author, bookid, dateofpub, price, title);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BookClass other = (BookClass) obj;
		return Objects.equals(author, other.author) && bookid == other.bookid
				&& Objects.equals(dateofpub, other.dateofpub)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(title, other.title);
	}
	@Override
	public String toString() {
		return "BookClass [bookid=" + bookid + ", title=" + title + ", price=" + price + ", author=" + author
				+ ", dateofpub=" + dateofpub + "]";
	}
	
	   
}
