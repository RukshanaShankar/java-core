package com.learning.core.day1;

public class Book {
	private String book_title;
    private double book_price;

    public void setBookTitle(String booktitle) {
        this.book_title = booktitle;
    }
    public String getBookTitle() {
        return book_title;
    }

    public double getBookPrice() {
        return book_price;
    }

    public void setBookPrice(double bookprice) {
        this.book_price = bookprice;
    }
}
class BookOutput {
    public static Book createBook(String title, double price) {
        Book newBook = new Book();
        newBook.setBookTitle(title);
        newBook.setBookPrice(price);
        return newBook;
    }

    public static void showBook(Book book) {
        System.out.println("Book Title: " + book.getBookTitle() + "and Price:" +  book.getBookPrice());
    }
}

