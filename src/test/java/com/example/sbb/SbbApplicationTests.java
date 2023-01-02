package com.example.sbb;

// import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

// import com.example.sbb.question.Question;
import com.example.sbb.question.QuestionRepository;


@SpringBootTest
class SbbApplicationTests {

    @Autowired
    private QuestionRepository questionRepository;

    @Test
    void testJpa() {
        // this.questionRepository.findAll();
        this.questionRepository.deleteAll();
    }
}