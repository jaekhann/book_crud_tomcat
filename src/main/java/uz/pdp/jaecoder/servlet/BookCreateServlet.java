package uz.pdp.jaecoder.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import uz.pdp.jaecoder.entity.Book;
import uz.pdp.jaecoder.repository.BookRepository;

import java.io.IOException;

@WebServlet(name = "BookCreateServlet", urlPatterns = {
        "/book/add"
})
public class BookCreateServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/views/book/add.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String title = req.getParameter("title");
        String author = req.getParameter("author");
        int pages = Integer.parseInt(req.getParameter("pages"));
        Book book = new Book(1, title, author, pages);
        BookRepository.addBook(book);
        resp.sendRedirect("/book_crud/book/list");
    }
}
