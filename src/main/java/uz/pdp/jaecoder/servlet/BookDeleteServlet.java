package uz.pdp.jaecoder.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import uz.pdp.jaecoder.entity.Book;
import uz.pdp.jaecoder.repository.BookRepository;

import java.io.IOException;

@WebServlet(name = "BookDeleteServlet", urlPatterns = {
        "/book/delete/*"
})
public class BookDeleteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String requestURI = req.getRequestURI();
        int bookId = Integer.parseInt(requestURI.substring(requestURI.lastIndexOf('/') + 1));
        Book book = BookRepository.getBook(bookId);
        req.setAttribute("book", book);
        req.getRequestDispatcher("/views/book/delete.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String requestURI = req.getRequestURI();
        int bookId = Integer.parseInt(requestURI.substring(requestURI.lastIndexOf('/') + 1));
        BookRepository.deleteById(bookId);
        resp.sendRedirect("/book_crud/book/list");
    }
}
