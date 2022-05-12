package com.company.MonthandMath.controller;

import com.company.MonthandMath.models.MathSolve;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@WebMvcTest(MathSolveController.class)
public class MathSolveControllerTest {
    @Autowired
    private MockMvc mockMvc;

    private ObjectMapper mapper = new ObjectMapper();

    @Before
    public void setUp() throws Exception {}

    @Test
    public void shouldAddTwoNumbers() throws Exception {
        MathSolve input = new MathSolve();
        input.setOperand1(1);
        input.setOperand2(3);
        String inputString = mapper.writeValueAsString(input);

        MathSolve output = new MathSolve(1,3,"add",4);
        String outputString = mapper.writeValueAsString(output);

        mockMvc.perform(post("/add")
                        .content(inputString)
                        .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().json(outputString));
    }


    @Test
    public void shouldSubtractTwoNumbers() throws Exception {
        MathSolve input = new MathSolve();
        input.setOperand1(4);
        input.setOperand2(3);
        String inputString = mapper.writeValueAsString(input);

        MathSolve output = new MathSolve(4,3,"subtract",1);
        String outputString = mapper.writeValueAsString(output);

        mockMvc.perform(post("/subtract")
                        .content(inputString)
                        .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().json(outputString));
    }


    @Test
    public void shouldMultiplyTwoNumbers() throws Exception {
        MathSolve input = new MathSolve();
        input.setOperand1(5);
        input.setOperand2(3);
        String inputString = mapper.writeValueAsString(input);

        MathSolve output = new MathSolve(5,3,"multiply",15);
        String outputString = mapper.writeValueAsString(output);

        mockMvc.perform(post("/multiply")
                        .content(inputString)
                        .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().json(outputString));
    }


    @Test
    public void shouldDivideTwoNumbers() throws Exception {
        MathSolve input = new MathSolve();
        input.setOperand1(4);
        input.setOperand2(2);
        String inputString = mapper.writeValueAsString(input);

        MathSolve output = new MathSolve(4,2,"divide",2);
        String outputString = mapper.writeValueAsString(output);

        mockMvc.perform(post("/divide")
                        .content(inputString)
                        .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().json(outputString));
    }
}