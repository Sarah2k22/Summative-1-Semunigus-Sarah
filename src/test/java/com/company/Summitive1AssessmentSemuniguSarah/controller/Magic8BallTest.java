package com.company.Summitive1AssessmentSemuniguSarah.controller;

import com.company.Summitive1AssessmentSemuniguSarah.model.MagicBall;
import com.company.Summitive1AssessmentSemuniguSarah.model.Quote;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class Magic8BallTest {
    @Autowired
    private MockMvc mockMvc;

    private ObjectMapper mapper= new ObjectMapper();
    private List<MagicBall> answer;
    @Test
    public void mustReturnAnswer() throws Exception{
        String outputJson = mapper.writeValueAsString(answer);

        mockMvc.perform(get("/magic8Ball"))
                .andDo(print())
                .andExpect(status().isOk());
    }

}