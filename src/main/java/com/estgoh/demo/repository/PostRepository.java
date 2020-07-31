package com.estgoh.demo.repository;

import com.estgoh.demo.domain.Post;
import com.estgoh.demo.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}
