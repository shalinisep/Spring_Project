package com.library.model;


import java.util.Date;
import java.util.regex.Pattern;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

@Entity
@Table(name = "Books")
@Component
public class Books {

	@Id   //Specifies the primary key of an entity
	@GeneratedValue(strategy = GenerationType.AUTO)  
	private Integer bookId;
	private String bookTitle;
	private String bookAuthor;
	private String bookPublication;	
	private String bookGenre;//dropdown
	private String bookType;//ecopy,paperback - checkbox
	@Lob
	private byte[] bookCover;
	private Integer bookQuantity;
	private String bookBorrow;//radio button
	@DateTimeFormat (pattern="yyyy-MM-dd")
	private Date dateOfentry;
	
	


	public Books() {
		super();
		// TODO Auto-generated constructor stub
	}
	


	public Books(Integer bookId, String bookTitle, String bookAuthor, String bookPublication, String bookGenre,
			String bookType, Integer bookQuantity, String bookBorrow, Date dateOfentry) {
		super();
		this.bookId = bookId;
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		this.bookPublication = bookPublication;
		this.bookGenre = bookGenre;
		this.bookType = bookType;
		this.bookQuantity = bookQuantity;
		this.bookBorrow = bookBorrow;
		this.dateOfentry = dateOfentry;
	}



	public Books(Integer bookId, String bookTitle, String bookAuthor, String bookPublication, String bookGenre,
			String bookType, byte[] bookCover, Integer bookQuantity, String bookBorrow, Date dateOfentry) {
		super();
		this.bookId = bookId;
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		this.bookPublication = bookPublication;
		this.bookGenre = bookGenre;
		this.bookType = bookType;
		this.bookCover = bookCover;
		this.bookQuantity = bookQuantity;
		this.bookBorrow = bookBorrow;
		this.dateOfentry = dateOfentry;
	}



	public Integer getBookId() {
		return bookId;
	}


	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}


	public String getBookTitle() {
		return bookTitle;
	}


	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}


	public String getBookAuthor() {
		return bookAuthor;
	}


	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}


	public String getBookPublication() {
		return bookPublication;
	}


	public void setBookPublication(String bookPublication) {
		this.bookPublication = bookPublication;
	}


	public String getBookGenre() {
		return bookGenre;
	}


	public void setBookGenre(String bookGenre) {
		this.bookGenre = bookGenre;
	}


	public String getBookType() {
		return bookType;
	}


	public void setBookType(String bookType) {
		this.bookType = bookType;
	}


	public byte[] getBookCover() {
		return bookCover;
	}


	public void setBookCover(byte[] bookCover) {
		this.bookCover = bookCover;
	}


	public Integer getBookQuantity() {
		return bookQuantity;
	}


	public void setBookQuantity(Integer bookQuantity) {
		this.bookQuantity = bookQuantity;
	}


	public String getBookBorrow() {
		return bookBorrow;
	}


	public void setBookBorrow(String bookBorrow) {
		this.bookBorrow = bookBorrow;
	}


	public void setBookCoverPic(byte[] bookCover) {
		this.bookCover = bookCover;
	}
	public String getBookCoverPic() {
		return Base64.encodeBase64String(bookCover);
	}
	public Date getDateOfentry() {
		return dateOfentry;
	}


	public void setDateOfentry(Date dateOfentry) {
		this.dateOfentry = dateOfentry;
	}


	@Override
	public String toString() {
		return "Books [bookId=" + bookId + ", bookTitle=" + bookTitle + ", bookAuthor=" + bookAuthor
				+ ", bookPublication=" + bookPublication + ", bookGenre=" + bookGenre + ", bookType=" + bookType
				+ ", bookQuantity=" + bookQuantity + ", bookBorrow=" + bookBorrow + ", dateOfentry=" + dateOfentry
				+ "]";
	}


	
	
	
}
