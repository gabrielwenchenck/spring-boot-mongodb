package com.giwc.study.repository;

import com.giwc.study.domain.Post;
import com.giwc.study.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}
