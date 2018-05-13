package mvc.mvc1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String homePage() {
        return "index";
    }

    @GetMapping("/exampleForm")
    public String exampleForm(Model model) {
        model.addAttribute("request", new Request());
        return "exampleForm";
    }

    @PostMapping("/processRequest")
    public String processRequest(@ModelAttribute Request request) {
        System.out.println(request.getEmail() + " " + request.getPassword());
        return "requestProcessed";
    }
}
