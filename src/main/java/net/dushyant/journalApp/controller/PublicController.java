package net.dushyant.journalApp.controller;

import lombok.extern.slf4j.Slf4j;
import net.dushyant.journalApp.entity.User;
import net.dushyant.journalApp.service.UserDetailsServiceImpl;
import net.dushyant.journalApp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/public")
@Slf4j
public class PublicController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserDetailsServiceImpl userDetailsService;

    @GetMapping("health-check")
    public String healthCheck(){
        return "ok";
    }

    @PostMapping("/signup")
    public void signup(@RequestBody User user){
        userService.saveNewUser(user);
    }
}
