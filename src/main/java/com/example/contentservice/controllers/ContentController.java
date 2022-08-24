package com.example.contentservice.controllers;

import com.example.contentservice.Repositories.ContentRepository;
import com.example.contentservice.entities.Content;
import com.example.contentservice.entities.ContentAction;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.List;

@RestController
@RequestMapping("api/content")
public class ContentController {

    @Autowired
    private KafkaTemplate<String, ContentAction> kafkaTemplate;

    private static final String TOPIC = "notificationq";
    @Autowired
    private ContentRepository contentRepository;

    @Autowired
    private ObjectMapper jacksonObjectMapper;

    @GetMapping
    public List<Content> getAllContents() {return (List<Content>) contentRepository.findAll();}

    @PostMapping
    public Content saveContent(@Validated @RequestBody Content content) {

        kafkaTemplate.send(TOPIC, new ContentAction(content.getTitle(), content.getAuthorName(),content.getAuthorEmail(), new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new java.util.Date())));
        return contentRepository.save(content);
    }
}
