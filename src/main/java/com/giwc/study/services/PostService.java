package com.giwc.study.services;

import com.giwc.study.domain.Post;
import com.giwc.study.domain.User;
import com.giwc.study.dto.UserDTO;
import com.giwc.study.repository.PostRepository;
import com.giwc.study.repository.UserRepository;
import com.giwc.study.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository repository;

    public Post findById(String id) {
        Optional<Post> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Object not found"));
    }

    public List<Post> findByTitle(String text) {
        return repository.findByTitleContainingIgnoreCase(text);
    }
//    public List<Post> findByTitle(String text) {
//        return repository.searchTitle(text);
//    }

    public List<Post> search(String text, Date minDate, Date maxDate) {
        maxDate = new Date(maxDate.getTime() + 24 * 60 * 60 * 1000);
        return repository.search(text, minDate, maxDate);
    }
}
