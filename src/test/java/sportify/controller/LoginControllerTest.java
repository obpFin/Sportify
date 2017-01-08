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
 * Created by admin on 08/01/17.
 */
public class LoginControllerTest {
    private MockMvc mockMvc;
    private LoginController controller;

    @Before
    public void setup() {
        controller = new LoginController();

        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/view/");
        viewResolver.setSuffix(".html");

        mockMvc = MockMvcBuilders.standaloneSetup(new LoginController())
                .setViewResolvers(viewResolver)
                .build();
    }
    @Test
    public void loginShouldRenderLoginView() throws Exception {
        mockMvc.perform(get("/login")).andExpect(view().name("login"));
    }

}