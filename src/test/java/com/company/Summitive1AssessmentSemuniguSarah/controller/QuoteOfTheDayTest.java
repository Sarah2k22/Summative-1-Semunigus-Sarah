package com.company.Summitive1AssessmentSemuniguSarah.controller;

import com.company.Summitive1AssessmentSemuniguSarah.model.Quote;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(QuoteOfTheDay.class)
public class QuoteOfTheDayTest {
    @Autowired
    private MockMvc mockMvc;

    private ObjectMapper mapper= new ObjectMapper();
    private List<Quote> quoteList;

    @Test
    public void mustReturnQuote() throws Exception{
        String outputJson= mapper.writeValueAsString(quoteList);

        mockMvc.perform(get("/quote"))
                .andDo(print())
                .andExpect(status().isOk());
    }

}