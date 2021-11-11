package com.test;

class Book{
	String title;
	String author;
	int price;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(String title, String author, int price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}
	public String getInfo() {
		return title+"\t"+author+"\t"+price;
	}
}

public class Ex05_13 {
	
	public static void changeBook(Book book) {
		System.out.println("changeBook book = "+book);
		book.title="Oracle";
		book.price=3000;
	}

	public static void main(String[] args) {

		Book book = new Book("Java", "홍길동", 2000);
		System.out.println(book);
		System.out.println("변경 전 = "+book.getInfo());
		changeBook(book);
		System.out.println("변경 후 = "+book.getInfo());
	}

}
