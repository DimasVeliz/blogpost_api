package com.boosting.code.blogpost_api.Repositories;

import com.boosting.code.blogpost_api.Entities.Topic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITopicRepository extends JpaRepository<Topic,Integer> {
}
