package com.cybage.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;
@Entity
public class Author {
	@Id
	private String authorEmailId;
	private String authorName;
	private String authorContactNumber;

	@OneToMany(mappedBy = "bookAuthor", cascade = { CascadeType.ALL })
	private List<Book> booklList;

	public Author() {
		super();
	}

	public Author(String authorEmailId, String authorName, String authorContactNumber, List<Book> booklList) {
		super();
		this.authorEmailId = authorEmailId;
		this.authorName = authorName;
		this.authorContactNumber = authorContactNumber;
		this.booklList = booklList;
	}

	public String getAuthorEmailId() {
		return authorEmailId;
	}

	public void setAuthorEmailId(String authorEmailId) {
		this.authorEmailId = authorEmailId;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getAuthorContactNumber() {
		return authorContactNumber;
	}

	public void setAuthorContactNumber(String authorContactNumber) {
		this.authorContactNumber = authorContactNumber;
	}

	@JsonManagedReference
	public List<Book> getBooklList() {
		return booklList;
	}

	public void setBooklList(List<Book> booklList) {
		this.booklList = booklList;
	}

	@Override
	public String toString() {
		return "Author [authorEmailId=" + authorEmailId + ", authorName=" + authorName + ", authorContactNumber="
				+ authorContactNumber + ", booklList=" + booklList + "]";
	}

}
