package com.bcp.devkiller.dao;

import com.bcp.devkiller.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long> {
}
