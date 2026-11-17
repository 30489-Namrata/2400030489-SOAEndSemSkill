package com.klu.services;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(AdditionController.class)
public class AdditionControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testAdditionWithNegativeNumbers() throws Exception {

        mockMvc.perform(get("/MS1")
                .param("a", "-5")
                .param("b", "5"))

                .andExpect(status().isOk())

                .andExpect(content().string(
                    "MS1.1 addition equals 0"));
    }
}