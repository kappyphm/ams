package swp.gr5.ams.controller.user;

import swp.gr5.ams.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("users", userService.getAllUsers());
        return "home";
    }
}
