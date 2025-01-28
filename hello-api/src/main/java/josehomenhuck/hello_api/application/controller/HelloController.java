package josehomenhuck.hello_api.application.controller;

import josehomenhuck.hello_api.domain.contract.HelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
    private final HelloService helloService;

    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    @RequestMapping
    public String hello() {
        return helloService.sayHello();
    }
}
