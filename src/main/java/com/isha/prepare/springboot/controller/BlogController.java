package com.isha.prepare.springboot.controller;

import com.isha.prepare.springboot.model.Blog;
import com.isha.prepare.springboot.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BlogController {

    @Autowired
    private final BlogRepository repository;

    public BlogController(BlogRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/blogs")
    public List<Blog> findAll(){
        return repository.findAll();
    }

    @PutMapping("/blogs/{id}")
    public Blog saveOrUpdate(@RequestBody Blog blog, @PathVariable Long id){
        return null;
    }
}
