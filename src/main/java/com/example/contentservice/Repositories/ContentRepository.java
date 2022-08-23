package com.example.contentservice.Repositories;

import com.example.contentservice.entities.Content;
import org.springframework.data.repository.CrudRepository;

public interface ContentRepository extends CrudRepository<Content, Long> {

}
