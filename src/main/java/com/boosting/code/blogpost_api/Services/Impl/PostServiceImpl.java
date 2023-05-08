package com.boosting.code.blogpost_api.Services.Impl;

import com.boosting.code.blogpost_api.Dtos.PostDto;
import com.boosting.code.blogpost_api.Repositories.IPostRepository;
import com.boosting.code.blogpost_api.Services.IBlogPostService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PostServiceImpl implements IBlogPostService {

    private final IPostRepository postRepository;
    @Override
    public List<PostDto> getAllPostByTopicId(int topicId) {
        return postRepository
                .findAllByTopicId(topicId)
                .stream().map(post->PostDto
                                    .builder()
                        .topic_id(post.getTopic().getId())
                        .image(post.getImage())
                        .text(post.getText())
                        .build()
                ).toList();
    }

    @Override
    public List<PostDto> getMostPopular() {
        return Collections.EMPTY_LIST;
    }
}
