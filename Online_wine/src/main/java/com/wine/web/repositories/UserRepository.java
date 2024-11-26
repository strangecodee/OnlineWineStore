package com.wine.web.repositories;

import org.springframework.data.repository.CrudRepository;

import com.wine.web.entities.Admin;
import com.wine.web.entities.User;

public interface UserRepository extends CrudRepository<User,Integer>
{
public User findUserByUemail(String email);
}
