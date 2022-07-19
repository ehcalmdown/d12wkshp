package sg.edu.nus.iss.day12wkshp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
@RequestMapping(path= {"/indexresource", "/indexresource.html"})
public class IndexResource {
    
    @GetMapping(produces = {"text/html"})
    public String index(Model model) {
        return "indexresource";
    }
}
