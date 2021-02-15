package com.nguyentrinhan.minisocial.core.service;

import com.nguyentrinhan.minisocial.core.entity.Role;
import com.nguyentrinhan.minisocial.core.entity.User;
import com.nguyentrinhan.minisocial.core.repository.UserRepository;
import com.nguyentrinhan.minisocial.core.web.dto.UserRegistrationDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.Arrays;

@Service
public class UserServiceImpl implements UserService{

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        super();
        this.userRepository = userRepository;
    }

    @Override
    public User save(UserRegistrationDTO userRegistrationDTO) {
        User user = new User(userRegistrationDTO.getEmail(),
                userRegistrationDTO.getFirstName(),
                userRegistrationDTO.getLastName(),
                userRegistrationDTO.getPassword(),
                new Date(System.currentTimeMillis()),
                "default.jpg",
                Arrays.asList(new Role("ROLE_USER")));
        return userRepository.save(user);
    }
}
