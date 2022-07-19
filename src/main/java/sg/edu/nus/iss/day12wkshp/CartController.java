package sg.edu.nus.iss.day12wkshp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import java.util.List;

import sg.edu.nus.iss.day12wkshp.CartService;

@Controller
@RequestMapping(path = { "/cart" })
public class CartController {
    
    @GetMapping(produces = { "text/html" })
    public String displayCart(Model model) {
        CartService cs = new CartService();
        List<Item> cartItems = cs.getShoppingItems();
        model.addAttribute("cart", cartItems);

        return "cart";
    }
}
