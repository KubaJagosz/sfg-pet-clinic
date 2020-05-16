package guru.springframework.sfgpetclinic.controllers.owners;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owners")
@Controller
public class OwnerController {
    @GetMapping({"","/index","/index.html"})
    public String getOwners(){
        return "/owners/index";
    }
}
