package com.example.File.Upload.service;


import com.example.File.Upload.model.FileModal;
import com.example.File.Upload.repository.FileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FileServiceImplementation implements FileService {

    // @Autowired annotation used to inject
    // the object dependency of FileRepository
    @Autowired
    FileRepository fileRepository;

    @Override
    public List<FileModal> getAllFiles() {
        // fetch all the files form database
        return fileRepository.findAll();
    }
    public void saveAllFilesList(List<FileModal> fileList) {
        // Save all the files into database
        for (FileModal fileModal : fileList)
            fileRepository.save(fileModal);
    }
}