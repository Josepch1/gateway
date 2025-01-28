package josehomenhuck.hello_api.application.impl;

import josehomenhuck.hello_api.domain.contract.HelloService;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello() {
        return "Hello world!";
    }
}

