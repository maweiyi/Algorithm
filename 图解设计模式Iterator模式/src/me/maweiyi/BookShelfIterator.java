package me.maweiyi;

/**
 * Created by MWY
 * Date: 1/10/17
 * Time: 22:21
 */
public class BookShelfIterator implements Iterator {
    private BookShelf bookShelf;
    private int index;
    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }
    @Override
    public boolean hasNext() {
        //return false;
        if (index < bookShelf.getLength()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Object next() {
        //return null;
        Book book = bookShelf.getBookAt(index);
        index++;
        return book;
    }
}
