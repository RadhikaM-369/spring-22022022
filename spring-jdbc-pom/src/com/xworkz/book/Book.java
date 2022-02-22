package com.xworkz.book;

public class Book {
	private int Id; 
	private String name; 
	private String bookAuthor; 
	private int bookPrice; 
	private String bookEdition;
	public Book(int Id,String name, String bookAuthor, int bookPrice, String bookEdition) {
		this.Id=Id;
		this.name = name;
		this.bookAuthor = bookAuthor;
		this.bookPrice = bookPrice;
		this.bookEdition = bookEdition;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public int getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}
	public String getBookEdition() {
		return bookEdition;
	}
	public void setBookEdition(String bookEdition) {
		this.bookEdition = bookEdition;
	}
	@Override
	public String toString() {
		return "Book [Id=" + Id + ", name=" + name + ", bookAuthor=" + bookAuthor + ", bookPrice=" + bookPrice
				+ ", bookEdition=" + bookEdition + "]";
	}
		
	
}
