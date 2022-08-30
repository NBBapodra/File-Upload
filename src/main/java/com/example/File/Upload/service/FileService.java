package com.example.File.Upload.service;


import com.example.File.Upload.model.FileModal;

import java.util.List;

public interface FileService {
    List<FileModal> getAllFiles();
    void saveAllFilesList(List<FileModal> fileList);
}