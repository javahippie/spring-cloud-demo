package de.javahippie.springcloud.frontend.domains.travel;

import de.javahippie.springcloud.frontend.domains.car.CarClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TravelController {

    @Autowired
    private CarClient carClient;

    @GetMapping("/travel")
    public String travel(Model model) {
        model.addAttribute("cars", carClient.getAllCars());
        return "travel";
    }
}
