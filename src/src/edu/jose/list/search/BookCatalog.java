package edu.jose.list.search;

import java.util.ArrayList;
import java.util.List;

public class BookCatalog {
    private List<Book> booklist;

    public BookCatalog() {
        this.booklist = new ArrayList<>();
    }

    public void addBook(String title, String author, int year) {
        Book book = new Book(title, author, year);
        booklist.add(book);
    }

    public List<Book> searchByAuthor(String author) {
        List<Book> matchingBooks = new ArrayList<>();

        for (Book book : booklist) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                matchingBooks.add(book);
            }
        }
        return matchingBooks;
    }

    public List<Book> rangeSearch(int startingYear, int finalYear) {
        List<Book> matchingBooks = new ArrayList<>();

        for (Book book : booklist) {
            int year = book.getYearPublication();
            if (year >= startingYear && year <= finalYear) {
                matchingBooks.add(book);
            }
        }
        return matchingBooks;
    }

    public List<Book> searchByTitle(String title) {
        List<Book> matchingBooks = new ArrayList<>();

        for (Book book : booklist) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                matchingBooks.add(book);
            }
        }
        return matchingBooks;
    }

    public static void main(String[] args) {
        BookCatalog bookCatalog = new BookCatalog();

        // Adicionando livros ao catálogo
        bookCatalog.addBook("The Great Gatsby", "F. Scott Fitzgerald", 1925);
        bookCatalog.addBook("To Kill a Mockingbird", "Harper Lee", 1960);
        bookCatalog.addBook("1984", "George Orwell", 1949);
        bookCatalog.addBook("Pride and Prejudice", "Jane Austen", 1813);
        bookCatalog.addBook("Moby Dick", "Herman Melville", 1851);

        // Testando buscas
        System.out.println(bookCatalog.searchByTitle("Moby Dick"));
        System.out.println(bookCatalog.rangeSearch(1900, 2000));
        System.out.println(bookCatalog.searchByAuthor("George Orwell"));
    }
}
