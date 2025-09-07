package com.prac.practical_programming.chapter02.sc2_2;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

public class UserCreateRequest {
    public final String username;
    public final  String password;
    public final  String email;
    public final  String address;
    public final  String gender;
    public final  int age;

    @Builder
    public UserCreateRequest(
            @JsonProperty("username") String username,
            @JsonProperty("password") String password,
            @JsonProperty("email") String email,
            @JsonProperty("address") String address,
            @JsonProperty("gender") String gender,
            @JsonProperty("age") int age) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.address = address;
        this.gender = gender;
        this.age = age;
    }
}
