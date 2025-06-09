package com.group.libraryapp.controller.user;

import org.springframework.web.bind.annotation.RestController;

import com.group.libraryapp.domain.user.Fruit;
import com.group.libraryapp.domain.user.User;
import com.group.libraryapp.dto.user.request.UserCreateRequest;
import com.group.libraryapp.dto.user.response.UserResponse;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class UserController {
    private final List<User> users = new ArrayList<>();


    @PostMapping("/user")
    public void saveUser(@RequestBody UserCreateRequest request) {
        // 사용자 정보를 저장하는 로직을 여기에 작성합니다.
        // 예: userService.save(userCreateRequest);


        users.add(new User(request.getName() , request.getAge()));
    

    }

    @GetMapping("/user")
    public List<UserResponse> getUsers() {
        List<UserResponse> responses = new ArrayList<>();
       for (int i =0; i< users.size(); i++) {
           
            responses.add(new UserResponse(i + 1, users.get(i)));
        }
        return responses;
    }
   
    
}
