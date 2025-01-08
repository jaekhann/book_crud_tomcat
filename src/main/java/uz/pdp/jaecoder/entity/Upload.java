package uz.pdp.jaecoder.entity;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Upload {
    private UUID id;
    private String originalName;
    private String generatedName;
    private String mimeType;
    private long size;
}
