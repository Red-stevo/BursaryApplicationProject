package com.bree.springproject.onlinebursaryapplication.repository;

import com.bree.springproject.onlinebursaryapplication.Entity.UserRegistrationTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRegistrationRepository extends JpaRepository<UserRegistrationTable, Long> {

    UserRegistrationTable findByEmail(String userEmail);

    UserRegistrationTable findByPhoneNumber(String phoneNumber);

    UserRegistrationTable findByUsername(String userName);

    @Query("SELECT T.username FROM UserRegistrationTable T WHERE T.userId = :userId")
    String findUsernameByUserId(Long userId);
}