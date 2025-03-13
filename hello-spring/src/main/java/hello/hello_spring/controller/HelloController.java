package hello.hello_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping("hello")
    public String hello(Model model) {
        model.addAttribute("data", "hello!");
        return "hello";
    }

    // http://localhost:8080/hello-string?name=아무개
    @GetMapping("hello-mvc")
    public String hellMvc(@RequestParam("name") String name, Model model) {
        model.addAttribute("name", name);
        return "hello-template";
    }

    // http://localhost:8080/hello-string?name=아무개
    @GetMapping("hello-string")
    @ResponseBody // 응답 body 부분에 직접  넣어주겠다.
    public String helloString(@RequestParam("name") String name) {
        return "안녕 " + name;
    }
    // http://localhost:8080/hello-api?name=아무개
    @GetMapping("hello-api")
    @ResponseBody
    public Hello helloApi(@RequestParam("name") String userName) {
        Hello helloInstance = new Hello();
        helloInstance.setName(userName);
        return helloInstance;
    }

    static class Hello {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
