package com.vishal.SecurityApp.SecurityApplication.services;


import com.vishal.SecurityApp.SecurityApplication.dto.PostDto;

import java.util.List;

public interface PostService {

    List<PostDto> getAllPost();

    PostDto getPostById(Long postId);

    PostDto createNewPost(PostDto inputPost);

}
