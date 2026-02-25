package com.example.weatherproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.weatherproject.model.FileData;

public interface FileRepository extends JpaRepository<FileData, Long> {
}