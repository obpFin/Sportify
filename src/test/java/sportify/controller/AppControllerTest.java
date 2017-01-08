package sportify.controller;

import org.junit.Before;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

/**
 * Created by admin on 08/01/17.
 */
public class AppControllerTest {
    private MockMvc mockMvc;
    private AppController controller;

    @Before
    public void setup() {
        controller = new AppController();
        mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
    }

    @Test
    public void homepageShouldRenderIndexView() throws Exception {

        mockMvc.perform(get("/")).andExpect(view()
                .name("index"));

    }

}