package agpaytech.map.controller.country;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
@Slf4j
public class CountryControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    public void getCountryByName() throws Exception {
        this.mockMvc.perform(post("/country/Japan"))
                .andDo(print()).andExpect(status().isOk());
    }


    @Test
    public void getAWrongCountryByName() throws Exception {
        this.mockMvc.perform(post("/country/Croatia"))
                .andDo(print()).andExpect(status().isForbidden());
    }

}