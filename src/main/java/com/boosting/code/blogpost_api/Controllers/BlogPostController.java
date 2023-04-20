package com.boosting.code.blogpost_api.Controllers;

import com.boosting.code.blogpost_api.Dtos.PostDto;
import com.boosting.code.blogpost_api.Dtos.TopicDto;
import com.boosting.code.blogpost_api.Services.IBlogPostService;
import com.boosting.code.blogpost_api.Services.ITopicService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class BlogPostController {

    private final IBlogPostService blogPostService;
    private final ITopicService topicService;

    @GetMapping(path = "/topics")
    public ResponseEntity<List<TopicDto>> getAllTopics(){
        return new ResponseEntity<>(topicService.getAllTopics(), HttpStatus.OK);
    }

    @GetMapping(path = "/posts")
    public ResponseEntity<List<PostDto>> getAllTopics(@RequestParam String topicId){
        return new ResponseEntity<>(blogPostService.getAllPostByTopicId(topicId), HttpStatus.OK);
    }
}