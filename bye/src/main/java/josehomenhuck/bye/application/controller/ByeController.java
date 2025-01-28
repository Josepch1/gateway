package josehomenhuck.bye.application.controller;

import josehomenhuck.bye.domain.contract.ByeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bye")
public class ByeController {
    private final ByeService byeService;

    public ByeController(ByeService byeService) {
        this.byeService = byeService;
    }

    @RequestMapping
    public String bye() {
        return byeService.sayBye();
    }
}

