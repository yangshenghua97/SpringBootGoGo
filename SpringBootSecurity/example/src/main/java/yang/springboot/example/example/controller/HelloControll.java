package yang.springboot.example.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControll {
    @RequestMapping("/hello")
    public String Hello(){
        return "yanghsenghua";
    }
    @RequestMapping("/admin/hello")
    public String admin(){
        return "Hello Admin";
    }
    @RequestMapping("/user/hello")
    public String user(){
        return "Hello User";
    }
    @RequestMapping("/db/hello")
    public String db(){
        return "Hello DBA ";
    }
}
