package sportify.controller;

import org.junit.Before;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static sun.misc.Version.print;

/**
 * Created by admin on 19/01/17.
 */
public class FormTest {

    private MockMvc mockMvc;

    @Before
    public void setup() throws Exception {

        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/");
        viewResolver.setSuffix(".html");

        this.mockMvc = MockMvcBuilders.standaloneSetup(new UserController()).setViewResolvers(viewResolver).build();

        }

    @Test
    public void addUser() throws Exception {

        this.mockMvc.perform(
                post("/profile")
                        .param("username", "Joe")
                        .param("password", "sfssfs")
                        .param("age", "19")
                        .param("location", "fkfkfkf"));



    }
}
