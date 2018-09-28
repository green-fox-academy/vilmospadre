package com.greenfoxacademy.reddit.services;

import com.greenfoxacademy.reddit.models.Post;

public interface PostService {

    Iterable<Post> findAll();
}
0