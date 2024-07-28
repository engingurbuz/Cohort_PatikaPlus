package week5.teknik_icerik_2;

import java.util.*;

class Book implements Comparable<Book> {
    private String name;
    private int pageCount;
    private String author;
    private String publishDate;

    public Book(String name, int pageCount, String author, String publishDate) {
        this.name = name;
        this.pageCount = pageCount;
        this.author = author;
        this.publishDate = publishDate;
    }

    public String getName() {
        return name;
    }

    public int getPageCount() {
        return pageCount;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublishDate() {
        return publishDate;
    }

    @Override
    public int compareTo(Book other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return "Book{name='" + name + "', pageCount=" + pageCount + ", author='" + author + "', publishDate='" + publishDate + "'}";
    }
}

public class BookSorter {
    public static void main(String[] args) {
        // 5 adet Book nesnesi oluşturma
        Book book1 = new Book("The Catcher in the Rye", 277, "J.D. Salinger", "1951");
        Book book2 = new Book("To Kill a Mockingbird", 336, "Harper Lee", "1960");
        Book book3 = new Book("1984", 328, "George Orwell", "1949");
        Book book4 = new Book("Moby Dick", 635, "Herman Melville", "1851");
        Book book5 = new Book("The Great Gatsby", 180, "F. Scott Fitzgerald", "1925");

        // Kitapları isme göre sıralayıp saklayan Set
        Set<Book> booksByName = new TreeSet<>();
        booksByName.add(book1);
        booksByName.add(book2);
        booksByName.add(book3);
        booksByName.add(book4);
        booksByName.add(book5);

        System.out.println("Books sorted by name:");
        for (Book book : booksByName) {
            System.out.println(book);
        }

        // Kitapları sayfa sayısına göre sıralayıp saklayan Set
        Set<Book> booksByPageCount = new TreeSet<>(Comparator.comparingInt(Book::getPageCount));
        booksByPageCount.addAll(booksByName); // Aynı kitapları kullanıyoruz

        System.out.println("\nBooks sorted by page count:");
        for (Book book : booksByPageCount) {
            System.out.println(book);
        }
    }
}
