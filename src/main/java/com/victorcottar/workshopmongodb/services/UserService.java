package com.victorcottar.workshopmongodb.services;

import com.victorcottar.workshopmongodb.domain.User;
import com.victorcottar.workshopmongodb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public List<User> findAll() {
        return repo.findAll();
    }
}