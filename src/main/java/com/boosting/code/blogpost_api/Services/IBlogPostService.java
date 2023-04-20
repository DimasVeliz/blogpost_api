package com.boosting.code.blogpost_api.Services;

import com.boosting.code.blogpost_api.Dtos.PostDto;

import java.util.List;

public interface IBlogPostService {
    List<PostDto> getAllPostByTopicId(String topicId);
}
