package com.group.libraryapp.controller.user;

import org.springframework.web.bind.annotation.RestController;

import com.group.libraryapp.domain.user.User;
import com.group.libraryapp.dto.user.request.UserCreateRequest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {
    private final List<User> users = new ArrayList<>();


    @PostMapping("/user")
    public void saveUser(@RequestBody UserCreateRequest request) {
        // 사용자 정보를 저장하는 로직을 여기에 작성합니다.
        // 예: userService.save(userCreateRequest);

        users.add(new User(request.getName() , request.getAge()));
    

    }
}
