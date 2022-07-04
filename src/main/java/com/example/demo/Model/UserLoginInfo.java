package com.example.demo.Model;

import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Tables;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.namespace.QName;
import java.sql.Timestamp;
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "UserLoginInfo")
public class UserLoginInfo {
    @Id
    @Column(name = "visitor_id")
    private String visitorId;
    @Column(name = "user_name")
    private String userName;
    @Column(name ="email")
    private String email;
    @Column(name ="phone_number")
    private String phoneNumber;
    @Column(name="city")
    private String city;
    @Column(name = "page_type")
    private String PageType;

}
