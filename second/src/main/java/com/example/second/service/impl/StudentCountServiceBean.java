package com.example.second.service.impl;


import com.example.second.dao.StudentCountDao;
import com.example.second.entity.StudentCount;
import com.example.second.service.StudentCountService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class StudentCountServiceBean implements StudentCountService {
    public void addCount(StudentCount studentCount) {
        Integer count = studentCount.getCount();

    }

    public void reduceCount(StudentCount studentCount) {
        Integer count = studentCount.getCount();

    }

    public static void main(String[] args) {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        String encode = bCryptPasswordEncoder.encode("123456");
        System.out.println(encode);
    }
}
