package com.jpaproject.springboot.domain.posts;

import com.jpaproject.springboot.domain.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Getter
@NoArgsConstructor
@Entity
public class Posts extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT")
    private String content;

    private String anthor;

    @Builder
    public Posts(String title, String content, String anthor) {
        this.title = title;
        this.content = content;
        this.anthor = anthor;
    }

    public void update(String title, String content) {
        this.title = title;
        this.content = content;
    }

}
