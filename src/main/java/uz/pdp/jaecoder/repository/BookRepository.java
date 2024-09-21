package uz.pdp.jaecoder.repository;

import uz.pdp.jaecoder.entity.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class BookRepository {

    public static final List<Book> books = new ArrayList<>();
    private static AtomicInteger counter = new AtomicInteger(0);

//    static {
//        books.add(new Book(counter.incrementAndGet(), "Otamdan Qolga dalalar", "Pirimqul Qodirov", 500));
//        books.add(new Book(counter.incrementAndGet(), "Otgan Kunlar", "O'tkir Hoshimov", 340));
//    }

    public static Book getBook(int id) {
        for (Book book: books) {
            if (book.getId() == id) {
                return book;
            }
        }
        return null;
    }

    public static void addBook(Book book) {
        book.setId(counter.incrementAndGet());
        books.add(book);
    }

    public static void updateBook(Book upd) {
        Book prev = getBook(upd.getId());
        if (prev == null) {
            return;
        }

        if (!upd.getTitle().isBlank()) {
            prev.setTitle(upd.getTitle());
        }
        if (!upd.getAuthor().isBlank()) {
            prev.setAuthor(upd.getAuthor());
        }
        if (upd.getPages() > 1) {
            prev.setPages(upd.getPages());
        }
    }

    public static void deleteById(int id) {
        books.removeIf(book -> book.getId() == id);
    }
}
