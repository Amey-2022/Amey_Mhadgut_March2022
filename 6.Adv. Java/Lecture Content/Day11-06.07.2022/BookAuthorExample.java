package com.cdac.app;

import java.util.ArrayList;
import java.util.List;

import com.cdac.dao.GenericDao;
import com.cdac.entity.Author;
import com.cdac.entity.Book;

public class BookAuthorExample {

	public static void main(String[] args) {
		GenericDao dao = new GenericDao();
		
		//adding few authors
		/*Author author = new Author();
		author.setName("Elisabeth Robson");
		author.setEmail("elisa@gmail.com");
		dao.save(author);*/
		
		//adding a book along with the author details
		/*Book book = new Book();
		book.setName("Head First Design Patterns");
		book.setCost(2500);
		
		List<Author> authors = new ArrayList<>();
		authors.add((Author) dao.fetchById(Author.class, 1));
		authors.add((Author) dao.fetchById(Author.class, 2));
		
		book.setAuthors(authors);
		
		dao.save(book);*/
		
		//assuming that first we want to add the book
		/*Book book = new Book();
		book.setName("Head First JavaScript");
		book.setCost(1500);
		dao.save(book);*/
		
		//then mention the authors of this book
		/*Book book = (Book) dao.fetchById(Book.class, 2);
		List<Author> authors = new ArrayList<>();
		authors.add((Author) dao.fetchById(Author.class, 1));
		authors.add((Author) dao.fetchById(Author.class, 2));
		
		book.setAuthors(authors);
		
		dao.save(book);*/
		
		//adding a book along with authors
		Book book = new Book();
		book.setName("Groovy 2 Cookbook");
		book.setCost(3000);
		
		Author author1 = new Author();
		author1.setName("Andrey Adamovich");
		author1.setEmail("andrey@gmail.com");
		
		Author author2 = new Author();
		author2.setName("Luciano Flandesio");
		author2.setEmail("luciano@gmail.com");
		
		List<Author> list = new ArrayList<>();
		list.add(author1);
		list.add(author2);
		
		book.setAuthors(list);
		
		dao.save(book);
	
	}
}
