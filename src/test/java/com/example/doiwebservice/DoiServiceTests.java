package com.example.doiwebservice;

import com.example.doiwebservice.domain.Root;
import com.example.doiwebservice.repository.DoiDao;
import com.example.doiwebservice.service.DoiService;
import com.example.doiwebservice.service.IDoiService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.BDDMockito.given;

@ExtendWith(SpringExtension.class)
@ContextConfiguration
public class DoiServiceTests {

    @MockBean
    DoiDao doiDao;

    @Autowired
    IDoiService doiService;

    @Configuration
    public static class ConfigHelper {
        @Bean
        public IDoiService startDoiService() {
            return new DoiService();
        }
    }

    @Test
    public void service_returnsList_ofAllDois_Test() {
        Root testDoi = new Root();
        given(doiDao.retrieveAllDois())
                .willReturn(Arrays.asList(testDoi));
        assertEquals(
                Arrays.asList(testDoi), doiService.getAllDois()
        );
    }
}
