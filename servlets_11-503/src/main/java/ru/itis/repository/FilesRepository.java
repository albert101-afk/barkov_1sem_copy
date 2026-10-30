package ru.itis.repository;

import ru.itis.models.FileInfo;

import java.io.File;

public interface FilesRepository extends CrudRepository<FileInfo>{
    FileInfo findById(Long id);
}
