package com.greenfoxacademy.reddit.services;

import com.greenfoxacademy.reddit.models.Post;

public interface PostService {

    void savePost(String title, String url);

    Iterable<Post> findAll();

    Iterable<Post> findAllByOrderByScoreDesc();

    void voteUp(Long id);

    void voteDown(Long id);
}
