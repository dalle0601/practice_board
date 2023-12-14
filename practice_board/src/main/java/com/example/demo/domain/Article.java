package com.example.demo.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

@Getter
@ToString
@Table(indexes = {
        @Index(columnList = "title"),
        @Index(columnList = "hashtag"),
        @Index(columnList = "createdAt"),
        @Index(columnList = "createdBy")
})
@Entity
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Setter private String title;   // 제목
    @Setter private String content; // 본문
    @Setter private String hashtag; // 해시태그

    @CreatedDate private LocalDateTime createdAt; // 생성일시
    @CreatedBy private String createdBy; // 생성자
    @LastModifiedDate private LocalDateTime modifiedAt; // 수정일시
    @LastModifiedBy private String modifiedBy; // 수정자
}
