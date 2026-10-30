package ru.itis.models;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class FileInfo {
    private Long id;
    private String originalFileName;
    // original_file_name;
    private String storageFileName;
    private Long size;
    private String type;
}
