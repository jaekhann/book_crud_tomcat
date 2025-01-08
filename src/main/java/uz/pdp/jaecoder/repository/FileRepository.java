package uz.pdp.jaecoder.repository;

import uz.pdp.jaecoder.entity.Upload;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class FileRepository {
    public static List<Upload> uploads = new ArrayList<>();

    public static Upload add(Upload upload) {
        upload.setId(UUID.randomUUID());
        uploads.add(upload);
        return upload;
    }

    public static Upload findById(UUID id) {
        for (Upload upload: uploads) {
            if (upload.getId().equals(id)) {
                return upload;
            }
        }
        return null;
    }
}
