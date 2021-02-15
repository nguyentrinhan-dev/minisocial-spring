package com.nguyentrinhan.minisocial.core.repository;

import com.nguyentrinhan.minisocial.core.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
