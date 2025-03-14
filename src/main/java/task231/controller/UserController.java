package task231.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import task231.model.User;
import task231.service.UserService;

import java.util.List;

@Controller
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "/")
    public String index(Model model) {
        List<User> users = userService.getUsers();
        model.addAttribute("users", users);
        return "index";
    }

    @GetMapping(value = "/newUser")
    public String newUser(Model model) {
        model.addAttribute("user", new User());
        return "createUser";
    }


    @PostMapping(value = "/saveUser")
    public String saveUser(@ModelAttribute("user") User user) {
        userService.addUser(user);
        return "redirect:/";
    }
}
