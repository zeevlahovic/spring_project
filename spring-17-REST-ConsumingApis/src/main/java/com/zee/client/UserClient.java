package com.zee.client;

import com.zee.dto.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

import java.util.List;

@FeignClient(url = "https://jsonplaceholder.typicode.com",name="USER-CLIENT")
public interface UserClient {


    @GetMapping("/users")
    List<User> getUsers();
}
