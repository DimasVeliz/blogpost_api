package com.boosting.code.blogpost_api.Repositories;

import com.boosting.code.blogpost_api.Entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPostRepository extends JpaRepository<Post,Integer> {
}
