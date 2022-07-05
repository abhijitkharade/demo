package com.example.demo.controller.mySqlController;

import com.example.demo.model.mySqlModel.UserLoginInfo;
import com.example.demo.repository.mySqlRepository.UserJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsersController {
    @Autowired
    private UserJpaRepository userJpaRepository;

    @GetMapping(value = "/all")
    public List<UserLoginInfo> findAll() {
        return userJpaRepository.findAll();
    }

    @GetMapping(value = "/{visitorId}")
    public UserLoginInfo findByVisitorId(@PathVariable String visitorId) {
        UserLoginInfo details = userJpaRepository.findByVisitorId(visitorId);

        return details;
    }

    @GetMapping(value = "/abc {city}")
    public List<UserLoginInfo> findByCity(@PathVariable String city) {

        List<UserLoginInfo> l = userJpaRepository.findByCity(city);
        return l;
    }
}





