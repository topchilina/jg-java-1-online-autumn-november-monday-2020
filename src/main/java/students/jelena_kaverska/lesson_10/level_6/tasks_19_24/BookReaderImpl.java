package students.jelena_kaverska.lesson_10.level_6.tasks_19_24;

import java.util.ArrayList;
import java.util.List;

class BookReaderImpl implements BookReader {
    private List<Book> books = new ArrayList<>();

    //в электронную библиотеку уствойства нельзя добавлять
    //одинаковые книги (книги у которых автор и название совпадают)
    @Override
    public boolean add(Book book) {
        if (!books.contains(book) && book.getAuthor() != null && book.getTitle() != null &&
                !book.getAuthor().isBlank() && !book.getTitle().isBlank()) {
            books.add(book);
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(Book book) {
        if (books.contains(book)) {
            books.remove(book);
            return true;
        }
        return false;
    }

    @Override
    public List<Book> getAllBooks() {
        return books;
    }

    @Override
    public List<Book> findByAuthor(String author) {
        List<Book> results = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().contains(author)) {
                results.add(book);
            }
        }
        return results;
    }

    @Override
    public List<Book> findByTitle(String title) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().contains(title)) {
                result.add(book);
            }
        }
        return result;
    }

    //при попытке пометить как прочитанную не существующую в библиотеке книгу
    // ваша программа должна возвращать false, а если указанная книга есть в
    // электронной библиотеки программа должна помечать её как прочитанную
    //и возвращать true
    @Override
    public boolean markAsRead(Book book) {
        for (Book b : books) {
            if (b.equals(book) && !b.isRead()) {
                b.setRead(true);
                return true;
            }
        }
        return false;
    }

    // при попытке отметить как не прочитанную не существующую в библиотеке книгу
    // ваша программа должна возвращать false, а если указанная книга есть в
    // электронной библиотеки программа должна помечать её как не прочитанную
    // и возвращать true.
    @Override
    public boolean markAsUnRead(Book book) {
        for (Book b : books) {
            if (b.equals(book) && b.isRead()) {
                b.setRead(false);
                return true;
            }
        }
        return false;
    }

    @Override
    public List<Book> getAllReadBooks() {
        List<Book> read = new ArrayList<>();
        for (Book book : books) {
            if (book.isRead()) {
                read.add(book);
            }
        }
        return read;
    }

    @Override
    public List<Book> getAllUnReadBooks() {
        List<Book> unread = new ArrayList<>();
        for (Book book : books) {
            if (!book.isRead()) {
                unread.add(book);
            }
        }
        return unread;
    }
}

class MyDemo {
    public static void main(String[] args) {
        BookReaderImpl br = new BookReaderImpl();
        Book book1 = new Book("Poirot 1", "Agatha Christie");
        Book book2 = new Book("Poirot 2", "Agatha Christie");
        Book book3 = new Book("Atlas Shrugged", "Ayn Rand");
        System.out.println(br.getAllBooks());
        br.add(book1);
        br.add(book2);
        br.add(book3);
        System.out.println(br.getAllBooks());
        System.out.println(br.getAllUnReadBooks());

        System.out.println(br.markAsRead(book1));
        System.out.println(br.getAllBooks());
        System.out.println(br.markAsRead(book3));

        System.out.println("all read: " + br.getAllReadBooks());
        System.out.println("all unread: " + br.getAllUnReadBooks());
    }
}