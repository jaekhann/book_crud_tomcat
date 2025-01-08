package uz.pdp.jaecoder.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import uz.pdp.jaecoder.entity.Upload;
import uz.pdp.jaecoder.repository.FileRepository;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.UUID;

public class FileUploadServletWithXml extends HttpServlet {
    private final Path rootPath =
            Path.of("/Users/jaxongir/Desktop/pdp/book-crud-project/resourceFiles");

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String filename = req.getParameter("filename");
        Upload upload = FileRepository.findById(UUID.fromString(filename));
        if (upload == null) {
            resp.getWriter().println("file is not found");
            resp.setStatus(HttpServletResponse.SC_NOT_FOUND);
            resp.getWriter().close();
            return;
        }

        Path filePath = rootPath.resolve(upload.getGeneratedName());
        if (!Files.exists(filePath)) {
            resp.getWriter().println("file is not found");
            resp.setStatus(HttpServletResponse.SC_NOT_FOUND);
            resp.getWriter().close();
            return;
        }

        resp.setContentType(upload.getMimeType());
        resp.setHeader("Content-Disposition", "attachment; filename=\"" + upload.getOriginalName() + "\"");
        resp.getOutputStream().write(Files.readAllBytes(filePath));
        resp.getOutputStream().close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
