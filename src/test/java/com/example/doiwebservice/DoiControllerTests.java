package com.example.doiwebservice;

import com.example.doiwebservice.controller.DoiController;
import com.example.doiwebservice.model.Data;
import com.example.doiwebservice.service.IDoiService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(controllers = DoiController.class)
@ExtendWith(SpringExtension.class)
public class DoiControllerTests {

    @Autowired
    MockMvc mockMvc;

    @MockBean
    IDoiService doiService;

    @Test
    public void test_requestTo_listAllDois() throws Exception {
        ArrayList<Data> testData = new ArrayList<Data>();

        when(doiService.requestAllDois())
                .thenReturn(new ResponseEntity<>(testData, HttpStatus.OK));

        mockMvc.perform(get("/list-all-dois").contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().is(200));
    }
}
