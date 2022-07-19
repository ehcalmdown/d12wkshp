package sg.edu.nus.iss.day12wkshp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;
import java.util.List;
import java.util.ArrayList;

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

    @GetMapping("{itemname}")
    public String filteredCart(
        @PathVariable(name="itemname", required=true) String itemname,
        Model model) {
        CartService cs = new CartService();
        List<Item> cartItems = cs.getShoppingItems();

        List<Item> filteredItems = new ArrayList<>();
        for (Item s : cartItems) {
            if (s.getItemName().contains(itemname)) {
                filteredItems.add(s);
            }
        }

        model.addAttribute("cart", filteredItems);

        return "cart";
    }
}
