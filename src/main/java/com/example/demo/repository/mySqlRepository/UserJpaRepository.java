package com.example.demo.repository.mySqlRepository;

import com.example.demo.model.mySqlModel.UserLoginInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserJpaRepository extends JpaRepository<UserLoginInfo,String> {
    UserLoginInfo findByVisitorId(String visitorId);
    List<UserLoginInfo> findByCity(String city);
}
