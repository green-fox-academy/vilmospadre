package com.greenfoxacademy.reddit.services;

import com.greenfoxacademy.reddit.models.Post;
import com.greenfoxacademy.reddit.repositories.PostRepository;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService {

    private final PostRepository postRepository;

    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public Iterable<Post> findAll() {
        return postRepository.findAll();
        //return null;
    }

    @Override
    public void savePost(String title, String url) {
        Post post = new Post(title, url);
        postRepository.save(post);
    }

    @Override
    public Iterable<Post> findAllByOrderByScoreDesc() {
        return postRepository.findAllByOrderByScoreDesc();
    }

    @Override
    public void voteUp(Long id) {
        if (postRepository.findById(id).isPresent()) {
            Post post = postRepository.findById(id).get();
            post.setScore(post.getScore() + 1);
            postRepository.save(post);
        }
    }

    @Override
    public void voteDown(Long id) {
        if (postRepository.findById(id).isPresent()) {
            Post post = postRepository.findById(id).get();
            post.setScore(post.getScore() - 1);
            postRepository.save(post);

        }
    }
}
