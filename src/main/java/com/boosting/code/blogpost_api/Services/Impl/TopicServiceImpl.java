package com.boosting.code.blogpost_api.Services.Impl;

import com.boosting.code.blogpost_api.Entities.Topic;
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
    public List<Topic> getAllTopics() {
        return topicRepository
                .findAll();
    }
}
