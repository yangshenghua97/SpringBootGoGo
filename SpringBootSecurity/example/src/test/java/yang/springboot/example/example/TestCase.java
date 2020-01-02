package yang.springboot.example.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import yang.springboot.example.example.entry.User;
import yang.springboot.example.example.service.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class TestCase {
    @Autowired
    TestRestTemplate testRestTemplate;
    @Autowired
    UserService service;
    @Autowired
    WebApplicationContext wac;
    MockMvc mockMvc;
    @Before
    public void before(){
        mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
    }
    @Test
    public void Test2(){
        ResponseEntity<String> hello = testRestTemplate.getForEntity("/db/hello?username=admin&password=yang123",String.class);
        System.out.println(hello.getStatusCodeValue());
    }
    @Test
    public void Test3(){
       User user = (User) service.loadUserByUsername("root");
        System.out.println(user.getRoles());
    }
}
