package com.nelio.course.resources;

import org.springframework.boot.autoconfigure.mail.MailSenderAutoConfiguration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nelio.course.entities.User;

import io.micrometer.core.ipc.http.HttpSender.Response;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
    
    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1L, "Maria", "Maria@gmail.com", "9999999999", "12345");
        return ResponseEntity.ok().body(u);

    }
}
