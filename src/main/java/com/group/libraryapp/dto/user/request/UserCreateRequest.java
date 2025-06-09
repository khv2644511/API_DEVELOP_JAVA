package com.group.libraryapp.dto.user.request;

public class UserCreateRequest {

    private String name;
    private Integer age; // Integer는 null을 허용/ int는 null을 허용하지 않음

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
 }