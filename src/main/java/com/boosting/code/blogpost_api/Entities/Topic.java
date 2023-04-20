package com.boosting.code.blogpost_api.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@Table(name = "topic")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Topic {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY )
    @Column(name="id")
    private int id;
    private String name;
    private String description;
    @OneToMany(mappedBy = "topic")
    private List<Post> posts;
}
