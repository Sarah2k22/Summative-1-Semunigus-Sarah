package com.company.Summitive1AssessmentSemuniguSarah.controller;

import com.company.Summitive1AssessmentSemuniguSarah.model.MagicBall;
import com.company.Summitive1AssessmentSemuniguSarah.model.Quote;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
@RunWith(SpringRunner.class)
@WebMvcTest(Magic8Ball.class)
public class Magic8BallTest {
    @Autowired
    private MockMvc mockMvc;

    private ObjectMapper mapper= new ObjectMapper();
    @Test
    public void mustReturnAnswer() throws Exception{
        MagicBall answer= new MagicBall();
        answer.setQuestion("Will this work?");
        String inputJson = mapper.writeValueAsString(answer);

        mockMvc.perform(post("/magic8Ball")
                .content(inputJson) // set request body
                .contentType(MediaType.APPLICATION_JSON))  // tell server its in JSON format
                .andDo(print())
                .andExpect(status().isOk());
    }

}