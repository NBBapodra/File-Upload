package com.example.File.Upload.repository;


import com.example.File.Upload.model.FileModal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<FileModal, Long> {

}