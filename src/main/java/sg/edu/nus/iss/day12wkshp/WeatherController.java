package sg.edu.nus.iss.day12wkshp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = { "/weather" })
public class WeatherController {

    @GetMapping
    public String weather(
            @RequestParam(required = true) String city,
            @RequestParam(name="units", defaultValue="kilometers") String units, 
            Model model) {

        model.addAttribute("city", city);
        model.addAttribute("units", units);
        return "weather";
    }

    @GetMapping("{city}")
    public String weather2(
        @PathVariable(name="city", required=true) String city,
        @RequestParam(name="units", defaultValue="kilometers") String units,
        Model model
    ) {

        model.addAttribute("city", city);
        model.addAttribute("units", units);
        return "weather";
    }
}
