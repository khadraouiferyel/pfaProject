package com.example.studyapp.service;

import com.example.studyapp.model.User;
import com.example.studyapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User createUser(User user) {
        Assert.notNull(user, "User object must not be null");
        return userRepository.save(user);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(String id) {
        Assert.notNull(id, "ID must not be null");
        Optional<User> optionalUser = userRepository.findById(id);
        return optionalUser.orElse(null);
    }


    public void deleteUser(String id) {
        Assert.notNull(id, "ID must not be null");
        userRepository.deleteById(id);
    }
    public User getUserByEmail(String email){
        Assert.notNull(email, "ID must not be null");
        Optional<User> optionalUser = userRepository.findByEmail(email);
        return optionalUser.orElse(null);
    }
}
