package com.example.buttonapp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@SpringBootTest
@AutoConfigureMockMvc
public class ButtonAppApplicationTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void contextLoads() {
    }
    
    @Test
    public void testHomePage() throws Exception {
        mockMvc.perform(get("/"))
               .andExpect(status().isOk())
               .andExpect(view().name("index"))
               .andExpect(model().attribute("message", "Welcome to Button App!"));
    }
    
    @Test
    public void testButton1Action() throws Exception {
        mockMvc.perform(post("/action").param("action", "button1"))
               .andExpect(status().isOk())
               .andExpect(view().name("index"))
               .andExpect(model().attribute("message", "You clicked Button 1!"));
    }
    
    @Test
    public void testButton2Action() throws Exception {
        mockMvc.perform(post("/action").param("action", "button2"))
               .andExpect(status().isOk())
               .andExpect(view().name("index"))
               .andExpect(model().attribute("message", "Button 2 was pressed!"));
    }
}
