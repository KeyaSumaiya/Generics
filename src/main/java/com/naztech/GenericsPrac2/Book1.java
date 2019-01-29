package com.naztech.GenericsPrac2;

import java.time.LocalDate;

public class Book1 {
	private int isbn;
	private String name;
	private String writer;
	LocalDate publishDate;
	
	
	

	Book1(int isbn, String name, String writer, LocalDate publishDate){
		this.isbn = isbn;
		this.name = name;
		this.writer = writer;
		this.publishDate=publishDate;
		}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public LocalDate getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(LocalDate publishDate) {
		this.publishDate = publishDate;
	}

	@Override
	public String toString() {
		return "Book1 [isbn=" + isbn + ", name=" + name + ", writer=" + writer + ", publishDate=" + publishDate + "]";
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Book1 b1=(Book1)obj;
		
		return this.isbn==b1.getIsbn() && this.name.equals(b1.getName()) && this.writer.equals(b1.getWriter())&& this.publishDate.equals(b1.getPublishDate());
	}
	
	
	

}
