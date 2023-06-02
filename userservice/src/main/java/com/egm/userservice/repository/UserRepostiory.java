package com.egm.userservice.repository;

import com.egm.userservice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepostiory extends JpaRepository<User,Long> {
}
