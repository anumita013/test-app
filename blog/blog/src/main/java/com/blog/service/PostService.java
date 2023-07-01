package com.blog.service;

import com.blog.payload.PostDto;

import java.util.List;

public interface PostService {
    PostDto createPost(PostDto postDto);

    List<PostDto> listAllPost();

    PostDto getPostById(long id);

    PostDto updatePost(long id, PostDto postDto);
}