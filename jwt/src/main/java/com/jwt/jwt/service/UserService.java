package com.jwt.jwt.service;

import com.jwt.jwt.model.Users;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    private List<Users> Store = new ArrayList<>();

    public UserService() {
        Store.add(new Users(UUID.randomUUID().toString(),"Anant","anant6@gmail.com"));
        Store.add(new Users(UUID.randomUUID().toString(),"golu","golu6@gmail.com"));
        Store.add(new Users(UUID.randomUUID().toString(),"sourav","sourav6@gmail.com"));
        Store.add(new Users(UUID.randomUUID().toString(),"gourav","gourav6@gmail.com"));
    }

    public List<Users> getUsers() {
        return this.Store;
    }
}
