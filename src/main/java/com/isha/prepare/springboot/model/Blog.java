package com.isha.prepare.springboot.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Blog {

    @Id
    private Long blogId;
    private String title;
    private String content;
    private Author author;


}
