package sportify.controller;

import org.junit.Before;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

/**
 * Created by admin on 09/01/17.
 */
public class StatisticsControllerTest {

    private MockMvc mockMvc;
    private StatisticsController controller;

    @Before
    public void setup() {
        controller = new StatisticsController();

        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/view/");
        viewResolver.setSuffix(".html");

        mockMvc = MockMvcBuilders.standaloneSetup(new StatisticsController())
                .setViewResolvers(viewResolver)
                .build();
    }

    @Test
    public void statisticsShouldRenderView() throws Exception {
        mockMvc.perform(get("/statistics")).andExpect(view().name("statistics"));
    }


}