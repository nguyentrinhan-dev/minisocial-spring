package com.nguyentrinhan.minisocial.core.service;

import com.nguyentrinhan.minisocial.core.entity.User;
import com.nguyentrinhan.minisocial.core.web.dto.UserRegistrationDTO;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDTO userRegistrationDTO);

    @Override
    UserDetails loadUserByUsername(String s) throws UsernameNotFoundException;
}
