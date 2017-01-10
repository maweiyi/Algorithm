package me.maweiyi;

/**
 * Created by MWY
 * Date: 1/10/17
 * Time: 20:38
 */
public class Main {

    public static void main(String[] args) {
	// write your code here
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("Java"));
        bookShelf.appendBook(new Book("Go"));
        bookShelf.appendBook(new Book("Python"));
        bookShelf.appendBook(new Book("JavaScript"));

        Iterator it = bookShelf.iterator();
        while (it.hasNext()) {
            Book book = (Book) it.next();
            System.out.println(book.getName());
        }
    }
}
