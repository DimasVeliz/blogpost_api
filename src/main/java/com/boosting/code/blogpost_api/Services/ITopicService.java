package com.boosting.code.blogpost_api.Services;

import com.boosting.code.blogpost_api.Dtos.TopicDto;

import java.util.List;

public interface ITopicService {
    List<TopicDto> getAllTopics();
}
