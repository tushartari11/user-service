package com.telefonica.prepaid.userinfo.repo;

import com.telefonica.prepaid.userinfo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
}