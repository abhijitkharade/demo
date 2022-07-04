package com.example.demo.repository;

import com.example.demo.Model.UserLoginInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;

public interface UserJpaRepository extends JpaRepository<UserLoginInfo,String> {
    UserLoginInfo findByVisitorId(String visitorId);
    List<UserLoginInfo> findByCity(String city);
}
