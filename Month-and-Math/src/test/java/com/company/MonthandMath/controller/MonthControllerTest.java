package com.company.MonthandMath.controller;

import com.company.MonthandMath.models.Month;
import com.company.MonthandMath.models.Month;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;
import static org.springframework.http.RequestEntity.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(MonthController.class)
public class MonthControllerTest {

    @Autowired
    private MockMvc mockMvc;

    private ObjectMapper mapper = new ObjectMapper();

    @Before
    public void setUp() {

    }

    @Test
    public void shouldReturnMonthByNumber() throws Exception {
        Month outputMonth = new Month("6", "June");
        String outputJson = mapper.writeValueAsString(outputMonth);

        mockMvc.perform(get("/month/6"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().json(outputJson));
    }

    @Test
    public void shouldReturnARandomMonth() throws Exception {


        mockMvc.perform(get("/randomMonth"))
                .andDo(print())
                .andExpect(status().isOk());

    }



}