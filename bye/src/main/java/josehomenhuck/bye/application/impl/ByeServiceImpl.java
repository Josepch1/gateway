package josehomenhuck.bye.application.impl;

import josehomenhuck.bye.domain.contract.ByeService;
import org.springframework.stereotype.Service;

@Service
public class ByeServiceImpl implements ByeService {

    @Override
    public String sayBye() {
        return "Bye world!";
    }
}

