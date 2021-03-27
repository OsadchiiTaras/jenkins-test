package test.jenkins.terraform.deployapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import test.jenkins.terraform.deployapp.user.User;

@RestController
public class UserController {

    @GetMapping("/user")
    public User getUser() {
        return new User("Test User");
    }
}
