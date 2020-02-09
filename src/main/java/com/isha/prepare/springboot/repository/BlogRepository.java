package com.isha.prepare.springboot.repository;

import com.isha.prepare.springboot.model.Blog;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogRepository extends MongoRepository<Blog, String> {

}
