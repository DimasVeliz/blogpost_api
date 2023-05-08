package com.boosting.code.blogpost_api.Services.Impl;

import com.boosting.code.blogpost_api.Dtos.TopicDto;
import com.boosting.code.blogpost_api.Repositories.ITopicRepository;
import com.boosting.code.blogpost_api.Services.ITopicService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TopicServiceImpl implements ITopicService {

    private final ITopicRepository topicRepository;
    @Override
    public List<TopicDto> getAllTopics() {
        return topicRepository
                .findAll().stream()
                .map(topic -> TopicDto
                        .builder()
                        .name(topic.getName())
                        .description(topic.getDescription())
                        .image(topic.getImage())
                        .build()).toList();
    }
}
