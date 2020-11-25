package com.stackroute.recommended.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.when;
import org.springframework.http.MediaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.stackroute.recommendation.controller.RecommendedController;
import com.stackroute.recommendation.model.Recommended;
import com.stackroute.recommendation.service.RecommendedService;

@RunWith(SpringRunner.class)
@WebMvcTest
public class RecommendationControllerTest {

	@Autowired
    private MockMvc mockMvc;
    
    @MockBean
    private Recommended recommended;
    
    @MockBean
    RecommendedService recommendedService;
    
    @InjectMocks
    RecommendedController recommendedController;
    
    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(recommendedController).build();
       
        recommended = new Recommended();
		recommended.setPid(1234);
		recommended.setName("Sachin");
		recommended.setFullName("Sachin Tendulkar");
		recommended.setCurrentAge("42 years");
		recommended.setCountry("India");
		recommended.setPlayingRole("Opener");
		recommended.setMajorTeams("India, Mumbai Indians");
		recommended.setImageURL("sampleimage.jpeg");
    }
    
    
    @Test
    public void addRecomSuccess() throws Exception  {
        when(recommendedService.addData(any())).thenReturn(true);
        mockMvc.perform(post("/api/recom")
                .contentType(MediaType.APPLICATION_JSON).content(asJsonString(recommended)))
                .andExpect(status().isCreated()).andDo(MockMvcResultHandlers.print());
    }
    
    
    @Test
    public void addRecomFailure() throws Exception {
        when(recommendedService.addData(any())).thenReturn(false);
        mockMvc.perform(post("/api/recom")
                .contentType(MediaType.APPLICATION_JSON).content(asJsonString(recommended)))
                .andExpect(status().isConflict()).andDo(MockMvcResultHandlers.print());
    }
   
   
    public static String asJsonString(final Object obj) {
        try {
            return new ObjectMapper().writeValueAsString(obj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
