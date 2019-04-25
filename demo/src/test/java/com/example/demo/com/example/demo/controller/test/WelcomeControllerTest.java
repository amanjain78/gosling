package com.example.demo.com.example.demo.controller.test;

import com.example.controllers.WelcomeController;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders.*;

/**
 * Created by aman on 2019-01-31.
 */
@WebMvcTest(controllers = WelcomeController.class)
public class WelcomeControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;


    @Test
    public void whenValidInput_thenReturns200() throws Exception {


        mockMvc.perform(MockMvcRequestBuilders.get("/sample"))
//                .contentType("application/json"))
//                .param("sendWelcomeMail", "true"))
//                .content(objectMapper.writeValueAsString(user)))
                .andExpect(MockMvcResultMatchers.status().isOk());





    }

}