package com.estgoh.demo.services;

import com.estgoh.demo.domain.Post;
import com.estgoh.demo.domain.User;
import com.estgoh.demo.dto.UserDTO;
import com.estgoh.demo.repository.PostRepository;
import com.estgoh.demo.repository.UserRepository;
import com.estgoh.demo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository repo;

    public Post findById(String id) {
        Optional<Post> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Object not found"));
    }

}
