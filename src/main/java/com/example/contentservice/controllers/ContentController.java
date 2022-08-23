package com.example.contentservice.controllers;

import com.example.contentservice.Repositories.ContentRepository;
import com.example.contentservice.entities.Content;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/content")
public class ContentController {

    @Autowired
    private ContentRepository contentRepository;

    @Autowired
    private ObjectMapper jacksonObjectMapper;

    @GetMapping
    public List<Content> getAllContents() {return (List<Content>) contentRepository.findAll();}

    @PostMapping
    public Content saveContent(@Validated @RequestBody Content content) {
        return contentRepository.save(content);
    }
}
