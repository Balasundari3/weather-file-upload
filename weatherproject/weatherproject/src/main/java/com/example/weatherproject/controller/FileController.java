package com.example.weatherproject.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import com.example.weatherproject.model.FileData;
import com.example.weatherproject.repository.FileRepository;

@Controller
public class FileController {

    @Autowired
    private FileRepository fileRepository;

    @GetMapping("/")
    public String home() {
        return "upload";
    }

    @PostMapping("/upload")
    @ResponseBody
    public String uploadFile(@RequestParam("file") MultipartFile file) {

        try {
            FileData fileData = new FileData(
                    file.getOriginalFilename(),
                    file.getContentType(),
                    file.getBytes()
            );

            fileRepository.save(fileData);

            return "SUCCESS File Uploaded!";
        } catch (IOException e) {
            e.printStackTrace();
            return "ERROR Upload Failed";
        }
    }
}