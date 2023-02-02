package com.example.sbb.answer;

import java.time.LocalDateTime;
import com.example.sbb.user.SiteUser;

import org.springframework.data.annotation.CreatedDate;

import com.example.sbb.question.Question;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Answer {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Column(columnDefinition = "TEXT")
  private String content;

  @CreatedDate
  private LocalDateTime createDate;
  private LocalDateTime modifyDate;

  @ManyToOne
  private Question question;

  @ManyToOne
  private SiteUser author;
}
