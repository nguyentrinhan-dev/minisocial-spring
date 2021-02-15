package com.nguyentrinhan.minisocial.core.service;

import com.nguyentrinhan.minisocial.core.entity.User;
import com.nguyentrinhan.minisocial.core.web.dto.UserRegistrationDTO;

public interface UserService {
    User save(UserRegistrationDTO userRegistrationDTO);
}
