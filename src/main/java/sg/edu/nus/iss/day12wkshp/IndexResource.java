package sg.edu.nus.iss.day12wkshp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

import java.util.Date;
import java.util.Calendar;

@Controller
@RequestMapping(path= {"/indexresource", "/indexresource.html"})
public class IndexResource {
    
    @GetMapping(produces = {"text/html"})
    public String index(Model model) {
        model.addAttribute("currTime", (new Date()).toString());

        Calendar cal = Calendar.getInstance();
        model.addAttribute("currHour", cal.get(Calendar.HOUR_OF_DAY));
        
        return "indexresource";
    }
}
