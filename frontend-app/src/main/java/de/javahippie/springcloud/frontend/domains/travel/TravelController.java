package de.javahippie.springcloud.frontend.domains.travel;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TravelController {

    @GetMapping("/travel")
    public String travel(Model model) {
        return "travel";
    }
}
